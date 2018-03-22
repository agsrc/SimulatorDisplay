package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

public class ArchSetup {

    //General Purpose Registers
    public Register R0;
    Register R1;
    Register R2;
    Register R3;

    //Index Registers
    public Register x1;
    Register x2;
    Register x3;

    //Memory Address Simulator.Register
    Register MAR;

    //Memory Buffer Simulator.Register
    Register MBR;

    //Program Counter
    Register PC;

    //Instruction Simulator.Register
    Register IR;

    //Internal Address Simulator.Register
    Register IAR;

    //Control Simulator.Register
    Register CC;

    //Main Memory
    int memory[][] = new int[2048][16];

    //Cache
    LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>();

    //Contents of the instruction after decoding
    String opcode;
    String R;
    String IX;
    String I;
    String Address;

    int addressSpecifier;
    JSONFile jsonFile;

    //default values
    String def16bitVal = "0000000000000000";
    String def12bitVal = "000000000000";
    String def4bitVal = "0000";

    //Object initialization of GUI class
    static GUI gui = new GUI();

    //boolean to check if all 5 instructions are executed
    boolean stop = false;

    /**
     * Main method
     */
    public static void main(String[] args) {
        Logger.getLogger("In main()");

        gui.windowOpen();
    }

    /**
     * Init method that initializes registers.
     * Reads JSON file that contains instructions and dummy value and stores them to memory
     * Sets initial value in Program Counter (PC)
     */
    void init() {
        x1 = new Register(def16bitVal, 16);
        x2 = new Register(def16bitVal, 16);
        x3 = new Register(def16bitVal, 16);

        R0 = new Register(def16bitVal, 16);
        R1 = new Register(def16bitVal, 16);
        R2 = new Register(def16bitVal, 16);
        R3 = new Register(def16bitVal, 16);

        MAR = new Register(def16bitVal, 16);
        MBR = new Register(def16bitVal, 16);

        PC = new Register(def12bitVal, 12);
        CC = new Register(def4bitVal, 4);

        IR = new Register(def16bitVal, 16);
        IAR = new Register(def16bitVal, 16);

        System.out.println("Here");

        jsonFile = new JSONFile();

        for (int i = 6; i < 6 + jsonFile.instructions.length; i++) {

            storeToMemory(Integer.toBinaryString(i), jsonFile.instructions[i - 6]);
        }


        PC.setValue(String.valueOf(6));

    }


    /**
     * Decodes instructions and seperates them into
     * opcode
     * R
     * IX
     * I
     * Address
     */
    public void instructionDecoder(String x) {

        opcode = x.substring(0, 6);
        R = x.substring(6, 8);
        IX = x.substring(8, 10);
        I = x.substring(10, 11);
        Address = x.substring(11, 16);

        System.out.println(" Instruction decoded: " + opcode);
        System.out.println(" Instruction decoded: " + R);
        System.out.println(" Instruction decoded: " + IX);
        System.out.println(" Instruction decoded: " + I);
        System.out.println(" Instruction decoded: " + Address);
    }

    /**
     * Loads the instruction from the memory
     *
     * @param address of the instruction is the address from which the instruction is to be fetched
     * @return is the value at the given address
     */

    String loadFromMemeory(String address) {
        String value = "";
//        int intAddress= Integer.parseInt(address,2);
        System.out.println("address load " + address);

        for (int i = 0; i < 16; i++) {

            value = value + memory[Integer.valueOf(address)][i];
        }
        return value;
    }

    /**
     * Stores the instruction into the memory
     *
     * @param address,value specifies the addres and the instruction to be stored in the memory
     */
    void storeToMemory(String address, String value) {

        int intAddress = Integer.parseInt(address, 2);
        System.out.println("Address: " + intAddress);
        System.out.println("value " + value.length());

        for (int i = 0; i < 16; i++) {

            System.out.println("value " + value);

            memory[intAddress][i] = Integer.parseInt(value.substring(0, 1));
            value = value.substring(1, value.length());

        }
    }

    /**
     * Loads the instruction from the cache
     *
     * @param key of the instruction is the address from which the instruction is to be fetched from the cache
     * @return is the value at the given key in the cache
     */

    String loadFromCache(String key) {
        long startTime = System.nanoTime();
        String value = "";
        if (cache.containsKey(key)) {
                value = cache.get(key);
        } else {
            //key does not exists
            if (cache.size()==16) {
                String temp = cache.entrySet().iterator().next().getKey();
                cache.remove(temp);
            }
            value = loadFromMemeory(key);
            cache.put(key,value);
            //System.out.println("Size of cache----->"+cache.size());
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken to load from Cache: "+(endTime - startTime) + " ns");
        return value;
    }

    /**
     * Stores the instruction into the cache
     *
     * @param key,value specifies the address and the instruction to be stored in the cache
     */
    void storeToCache(String key, String value) {

        long startTime = System.nanoTime();
        if (cache.size()==16) {
            String temp = cache.entrySet().iterator().next().getKey();
            cache.remove(temp);
        }

        cache.put(key,value);
        long endTime = System.nanoTime();
        System.out.println("Time taken to store to Cache: "+(endTime - startTime) + " ns");
        //System.out.println("Size of cache in store----->"+cache.size());
    }


    /**
     *
     * Computes the EA and returns it
     */
    String computeEA() {
        System.out.println(" IN EA : ");
        System.out.println(" IN EA : I= " + I);

        String EA = "";

        if (I.equals("0")) {          // NO Indirect Addressing
            System.out.println(" IN EA : I=0");

            switch (IX) {
                case "01":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x1.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                case "10":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x2.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                case "11":
                    EA = String.format("%12s", Integer.toBinaryString(Integer.parseInt(x3.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0');
                    break;
                default:
                    EA = Address;
                    break;
            }

            System.out.println("EA : " + EA);

        } else if (I.equals("1")) {              // indirect addressing

            switch (IX) {
                case "01": 			// both indirect addressing and indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x1.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    break;
                case "10": 			// both indirect addressing and indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x2.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    break;
                case "11": 			// both indirect addressing and indexing
                    EA = Address;


                    break;
                default:  			// indirect addressing, but NO indexing
                    EA = loadFromCache(String.format("%12s", Integer.toBinaryString(Integer.parseInt(x3.getValue(), 2)
                            + Integer.parseInt(Address, 2))).replace(' ', '0'));
                    EA = Address;

                    break;
            }

        }
        return String.valueOf(Integer.valueOf(EA, 2));

    }

    /**
     *  Mthod that keeps track of the cycle. 
     *  Executed when the single step button is clicked.
     *  CHecks for stop
     *  
     */
    void singleStep(int step) {

        String value = "";
        switch (step) {
            case 1:
                if(!stop) {                     // Run untill stop is true
                    MAR.setValue(PC.getValue());  //MAR set
                    System.out.print("MAR value: " + MAR.getValue());
                    gui.marTxtBox.setText(MAR.getValue());
                    gui.statusTxtBox.setText("Address in MAR");

                    // setting radio button/lights
                    gui.setRadioBtn16(Integer.toBinaryString(0x10000 | Integer.parseInt(MAR.getValue())).substring(1),
                            gui.marRadioBtn1, gui.marRadioBtn2, gui.marRadioBtn3, gui.marRadioBtn4, gui.marRadioBtn5,
                            gui.marRadioBtn6, gui.marRadioBtn7, gui.marRadioBtn8, gui.marRadioBtn9,
                            gui.marRadioBtn10, gui.marRadioBtn11, gui.marRadioBtn12, gui.marRadioBtn13,
                            gui.marRadioBtn14, gui.marRadioBtn15, gui.marRadioBtn16);
                }

                if (PC.getValue().equals("11")) { //All five instructions executed
                    stop = true;
                    gui.iplBtn.setEnabled(false);
                    gui.singleStepBtn.setEnabled(false);
                    gui.standardBtn.setEnabled(false);
                    gui.statusTxtBox.setText("All 5 instructions executed. Program ends");

                    break;
                } else {  //Increment PC

                    PC.setValue(String.valueOf(Integer.parseInt(PC.getValue()) + 1));
                    System.out.println("Value sent to PC: "+Integer.toBinaryString(0x10000 | Integer.parseInt(PC.getValue())).substring(1));
                    String binary= (Integer.toBinaryString(0x10000 | Integer.parseInt(PC.getValue())).substring(1)).substring(4, 16);
                    System.out.println("12 bit PC value: "+binary);
                    gui.setRadioBtn12(binary,
                            gui.pcRadioBtn1, gui.pcRadioBtn2, gui.pcRadioBtn3, gui.pcRadioBtn4, gui.pcRadioBtn5
                            , gui.pcRadioBtn6, gui.pcRadioBtn7, gui.pcRadioBtn8, gui.pcRadioBtn9,
                            gui.pcRadioBtn10, gui.pcRadioBtn11, gui.pcRadioBtn12);
                    
                    
                    // setting radio button/lights
                   /* gui.setRadioBtn12(Integer.toBinaryString(0x10000 | Integer.parseInt(PC.getValue())).substring(1),
                            gui.pcRadioBtn1, gui.pcRadioBtn2, gui.pcRadioBtn3, gui.pcRadioBtn4, gui.pcRadioBtn5
                            , gui.pcRadioBtn6, gui.pcRadioBtn7, gui.pcRadioBtn8, gui.pcRadioBtn9,
                            gui.pcRadioBtn10, gui.pcRadioBtn11, gui.pcRadioBtn12);*/

                    gui.pcTxtBox.setText(PC.getValue());
                }

                break;

            case 2: //MBR set

                value = loadFromCache(MAR.getValue());
                gui.statusTxtBox.setText("Instruction fetched from memory using address in MAR. MBR value set");
                MBR.setValue(value);
                gui.mbrTxtBox.setText(MBR.getValue());

                // setting radio button/lights
                gui.setRadioBtn16(MBR.getValue(), gui.mbrRadioBtn1, gui.mbrRadioBtn2,
                        gui.mbrRadioBtn3, gui.mbrRadioBtn4, gui.mbrRadioBtn5, gui.mbrRadioBtn6,
                        gui.mbrRadioBtn7, gui.mbrRadioBtn8, gui.mbrRadioBtn9, gui.mbrRadioBtn10, gui.mbrRadioBtn11,
                        gui.mbrRadioBtn12, gui.mbrRadioBtn13, gui.mbrRadioBtn14, gui.mbrRadioBtn15, gui.mbrRadioBtn16);

                break;


            case 3: //IR set

                IR.setValue(MBR.getValue());
                gui.irTxtBox.setText((IR.getValue()));
                gui.statusTxtBox.setText("Instruction loaded into IR from MBR");

                // setting radio button/lights
                gui.setRadioBtn16(IR.getValue(), gui.irRadioBtn1, gui.irRadioBtn2,
                        gui.irRadioBtn3, gui.irRadioBtn4, gui.irRadioBtn5, gui.marRadioBtn6,
                        gui.irRadioBtn7, gui.irRadioBtn8, gui.marRadioBtn9, gui.irRadioBtn10,
                        gui.irRadioBtn11, gui.irRadioBtn12, gui.irRadioBtn13, gui.irRadioBtn14,
                        gui.irRadioBtn15, gui.irRadioBtn16);
                break;

            case 4: //Decode INSTRUCTION

                instructionDecoder(IR.getValue());
                gui.statusTxtBox.setText("Instruction decoded");

                break;
            case 5: // set IAR

                int intAddress = Integer.parseInt(Address, 2);
                IAR.setValue(String.valueOf(intAddress));
                gui.iarTxtBox.setText(IAR.getValue());
                gui.statusTxtBox.setText("Address loaded in IAR after decoding instruction");

                break;

            case 6: //Compute EA and set IAR

                
                IAR.setValue(computeEA());
                gui.iarTxtBox.setText(IAR.getValue());
                gui.statusTxtBox.setText("Effective Address calculated and stored to IAR");
                break;

            case 7: //Set MAR from IAR
                MAR.setValue(IAR.getValue());
                gui.marTxtBox.setText(MAR.getValue());
                gui.statusTxtBox.setText("Address in MAR loaded from IAR");

                // setting radio button/lights
                gui.setRadioBtn16(Integer.toBinaryString(0x10000 | Integer.parseInt(MAR.getValue())).substring(1),
                        gui.marRadioBtn1, gui.marRadioBtn2, gui.marRadioBtn3, gui.marRadioBtn4, gui.marRadioBtn5,
                        gui.marRadioBtn6, gui.marRadioBtn7, gui.marRadioBtn8, gui.marRadioBtn9,
                        gui.marRadioBtn10, gui.marRadioBtn11, gui.marRadioBtn12, gui.marRadioBtn13,
                        gui.marRadioBtn14, gui.marRadioBtn15, gui.marRadioBtn16);

                break;

            case 8: //Setting MBR

                System.out.println(" CASE 8: Setting MBR");
                if (Integer.parseInt(opcode, 2) == 2) {
                    System.out.println(" Opcode = 2");

                    if (R.equals("00")) {

                        MBR.setValue(R0.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());

                    } else if (R.equals("01")) {
                        MBR.setValue(R1.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());


                    } else if (R.equals("10")) {
                        MBR.setValue(R2.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());

                    } else {
                        MBR.setValue(R3.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());


                    }
                } else if (Integer.parseInt(opcode, 2) == 42) {
                    if (IX.equals("01")) {

                        MBR.setValue(x1.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());

                    } else if (IX.equals("10")) {
                        MBR.setValue(x2.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());


                    } else {
                        MBR.setValue(x3.getValue());
                        gui.mbrTxtBox.setText(MBR.getValue());
                    }
                } else {
                    MBR.setValue(loadFromCache(MAR.getValue()));
                    gui.mbrTxtBox.setText(MBR.getValue());
                    gui.statusTxtBox.setText("MBR set from MAR");
                }

                // setting radio button/lights
                gui.setRadioBtn16(MBR.getValue(), gui.mbrRadioBtn1, gui.mbrRadioBtn2,
                        gui.mbrRadioBtn3, gui.mbrRadioBtn4, gui.mbrRadioBtn5, gui.mbrRadioBtn6,
                        gui.mbrRadioBtn7, gui.mbrRadioBtn8, gui.mbrRadioBtn9, gui.mbrRadioBtn10, gui.mbrRadioBtn11,
                        gui.mbrRadioBtn12, gui.mbrRadioBtn13, gui.mbrRadioBtn14, gui.mbrRadioBtn15, gui.mbrRadioBtn16);
                break;

            case 9: //Check for LDR, STR, LDA, LDX, STX

                System.out.println("opcode =" + Integer.parseInt(opcode, 2));
                switch (Integer.parseInt(opcode, 2)) {

                    //LDR
                    case 1:

                        gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);


                        if (R.equals("00")) {
                        	gui.r0ChkBox.setSelection(true);
                            R0.setValue(loadFromCache(IAR.getValue()));
                            gui.r0TxtBox.setText(R0.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R0.getValue(),gui.r0RadioBtn1, gui.r0RadioBtn2, gui.r0RadioBtn3,
                                    gui.r0RadioBtn4, gui.r0RadioBtn5, gui.r0RadioBtn6, gui.r0RadioBtn7, gui.r0RadioBtn8,
                                    gui. r0RadioBtn9, gui.r0RadioBtn10, gui.r0RadioBtn11, gui.r0RadioBtn12,
                                    gui.r0RadioBtn13, gui.r0RadioBtn14, gui.r0RadioBtn15, gui.r0RadioBtn16);
                        } else if (R.equals("01")) {
                        	gui.r1ChkBox.setSelection(true);
                            R1.setValue(loadFromCache(IAR.getValue()));
                            gui.r1TxtBox.setText(R1.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R1.getValue(),gui.r1RadioBtn1, gui.r1RadioBtn2, gui.r1RadioBtn3,
                                    gui.r1RadioBtn4, gui.r1RadioBtn5, gui.r1RadioBtn6, gui.r1RadioBtn7, gui.r1RadioBtn8,
                                    gui. r1RadioBtn9, gui.r1RadioBtn10, gui.r1RadioBtn11, gui.r1RadioBtn12,
                                    gui.r1RadioBtn13, gui.r1RadioBtn14, gui.r1RadioBtn15, gui.r1RadioBtn16);

                        } else if (R.equals("10")) {
                        	gui.r2ChkBox.setSelection(true);
                            R2.setValue(loadFromCache(IAR.getValue()));
                            gui.r2TxtBox.setText(R2.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R2.getValue(),gui.r2RadioBtn1, gui.r2RadioBtn2, gui.r2RadioBtn3,
                                    gui.r2RadioBtn4, gui.r2RadioBtn5, gui.r2RadioBtn6, gui.r2RadioBtn7, gui.r2RadioBtn8,
                                    gui. r2RadioBtn9, gui.r2RadioBtn10, gui.r2RadioBtn11, gui.r2RadioBtn12,
                                    gui.r2RadioBtn13, gui.r2RadioBtn14, gui.r2RadioBtn15, gui.r2RadioBtn16);
                        } else {
                        	gui.r3ChkBox.setSelection(true);
                            R3.setValue(loadFromCache(IAR.getValue()));
                            gui.r3TxtBox.setText(R3.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R3.getValue(),gui.r3RadioBtn1, gui.r3RadioBtn2, gui.r3RadioBtn3,
                                    gui.r3RadioBtn4, gui.r3RadioBtn5, gui.r3RadioBtn6, gui.r3RadioBtn7, gui.r3RadioBtn8,
                                    gui. r3RadioBtn9, gui.r3RadioBtn10, gui.r3RadioBtn11, gui.r3RadioBtn12,
                                    gui.r3RadioBtn13, gui.r3RadioBtn14, gui.r3RadioBtn15, gui.r3RadioBtn16);
                        }

                        gui.statusTxtBox.setText("LDR executed, General Purpose Register set.");
                        gui.ldrChkBox.setSelection(true);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);
                        break;

                    //STR
                    case 2:
                       
                    	gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);

                        if (R.equals("00")) {

                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), R0.getValue());
                        } else if (R.equals("01")) {
                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), R1.getValue());

                        } else if (R.equals("10")) {
                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), R2.getValue());
                        } else {
                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), R3.getValue());

                        }
                        gui.statusTxtBox.setText("STR executed at effective address");

                        gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(true);
                        gui.stxChkBox.setSelection(false);

                        break;

                    // LDA
                    case 3:

                    	gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);

                        if (R.equals("00")) {
                        	gui.r0ChkBox.setSelection(true);
                            R0.setValue(Integer.toBinaryString(Integer.parseInt(IAR.getValue())));
                            gui.r0TxtBox.setText(R0.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R0.getValue(),gui.r0RadioBtn1, gui.r0RadioBtn2, gui.r0RadioBtn3,
                                    gui.r0RadioBtn4, gui.r0RadioBtn5, gui.r0RadioBtn6, gui.r0RadioBtn7, gui.r0RadioBtn8,
                                    gui. r0RadioBtn9, gui.r0RadioBtn10, gui.r0RadioBtn11, gui.r0RadioBtn12,
                                    gui.r0RadioBtn13, gui.r0RadioBtn14, gui.r0RadioBtn15, gui.r0RadioBtn16);
                        } else if (R.equals("01")) {
                        	gui.r1ChkBox.setSelection(true);
                            R1.setValue(Integer.toBinaryString(0x10000 |Integer.parseInt(IAR.getValue())).substring(1));
                            gui.r1TxtBox.setText(R1.getValue());

                            // setting radio button/lights
                            System.out.println("Value in R1 bulbs"+Integer.toBinaryString(0x10000 |Integer.parseInt(R1.getValue())).substring(1));
                            gui.setRadioBtn16(R1.getValue(),gui.r1RadioBtn1, gui.r1RadioBtn2, gui.r1RadioBtn3,
                                    gui.r1RadioBtn4, gui.r1RadioBtn5, gui.r1RadioBtn6, gui.r1RadioBtn7, gui.r1RadioBtn8,
                                    gui. r1RadioBtn9, gui.r1RadioBtn10, gui.r1RadioBtn11, gui.r1RadioBtn12,
                                    gui.r1RadioBtn13, gui.r1RadioBtn14, gui.r1RadioBtn15, gui.r1RadioBtn16);


                        } else if (R.equals("10")) {
                        	gui.r2ChkBox.setSelection(true);
                            R2.setValue(Integer.toBinaryString(Integer.parseInt(IAR.getValue())));
                            gui.r2TxtBox.setText(R2.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R2.getValue(),gui.r2RadioBtn1, gui.r2RadioBtn2, gui.r2RadioBtn3,
                                    gui.r2RadioBtn4, gui.r2RadioBtn5, gui.r2RadioBtn6, gui.r2RadioBtn7, gui.r2RadioBtn8,
                                    gui. r2RadioBtn9, gui.r2RadioBtn10, gui.r2RadioBtn11, gui.r2RadioBtn12,
                                    gui.r2RadioBtn13, gui.r2RadioBtn14, gui.r2RadioBtn15, gui.r2RadioBtn16);

                        } else {
                        	gui.r3ChkBox.setSelection(true);
                            R3.setValue(Integer.toBinaryString(Integer.parseInt(IAR.getValue())));
                            gui.r3TxtBox.setText(R3.getValue());

                            // setting radio button/lights
                            gui.setRadioBtn16(R3.getValue(),gui.r3RadioBtn1, gui.r3RadioBtn2, gui.r3RadioBtn3,
                                    gui.r3RadioBtn4, gui.r3RadioBtn5, gui.r3RadioBtn6, gui.r3RadioBtn7, gui.r3RadioBtn8,
                                    gui. r3RadioBtn9, gui.r3RadioBtn10, gui.r3RadioBtn11, gui.r3RadioBtn12,
                                    gui.r3RadioBtn13, gui.r3RadioBtn14, gui.r3RadioBtn15, gui.r3RadioBtn16);
                        }

                        gui.statusTxtBox.setText("LDA executed");

                        gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(true);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);

                        break;

                    //LDX
                    case 41:


                    	gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);
                        
                        if (IX.equals("01")) {
                        	gui.x1ChkBox.setSelection(true);
                            x1.setValue(loadFromCache(IAR.getValue()));
                            gui.x1TxtBox.setText(x1.getValue());
                            gui.setRadioBtn16(x1.getValue(), gui.x1RadioBtn1, gui.x1RadioBtn2, gui.x1RadioBtn3,
                                    gui.x1RadioBtn4, gui.x1RadioBtn5, gui.x1RadioBtn6, gui.x1RadioBtn7,
                                    gui.x1RadioBtn8, gui.x1RadioBtn9, gui.x1RadioBtn10, gui.x1RadioBtn11,
                                    gui.x1RadioBtn12, gui.x1RadioBtn13, gui.x1RadioBtn14, gui.x1RadioBtn15,
                                    gui.x1RadioBtn16);
                        } else if (IX.equals("10")) {
                        	gui.x2ChkBox.setSelection(true);
                            x2.setValue(loadFromCache(IAR.getValue()));
                            gui.x2TxtBox.setText(x2.getValue());
                            gui.setRadioBtn16(x2.getValue(), gui.x2RadioBtn1, gui.x2RadioBtn2, gui.x2RadioBtn3,
                                    gui.x2RadioBtn4, gui.x2RadioBtn5, gui.x2RadioBtn6, gui.x2RadioBtn7,
                                    gui.x2RadioBtn8, gui.x2RadioBtn9, gui.x2RadioBtn10, gui.x2RadioBtn11,
                                    gui.x2RadioBtn12, gui.x2RadioBtn13, gui.x2RadioBtn14, gui.x2RadioBtn15,
                                    gui.x2RadioBtn16);
                        } else {
                        	gui.x3ChkBox.setSelection(true);
                            x3.setValue(loadFromCache(IAR.getValue()));
                            gui.x3TxtBox.setText(x3.getValue());
                            gui.setRadioBtn16(x3.getValue(), gui.x3RadioBtn1, gui.x3RadioBtn2, gui.x3RadioBtn3,
                                    gui.x3RadioBtn4, gui.x3RadioBtn5, gui.x3RadioBtn6, gui.x3RadioBtn7,
                                    gui.x3RadioBtn8, gui.x3RadioBtn9, gui.x3RadioBtn10, gui.x3RadioBtn11,
                                    gui.x3RadioBtn12, gui.x3RadioBtn13, gui.x3RadioBtn14, gui.x3RadioBtn15,
                                    gui.x3RadioBtn16);
                        }

                        gui.statusTxtBox.setText("LDX executed, Index set.");
                        gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(true);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);

                        break;

                    //STX
                    case 42:
                    	
                    	gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(false);

                        if (IX.equals("01")) {

                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), x1.getValue());
                        } else if (IX.equals("10")) {
                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), x2.getValue());

                        } else {
                            storeToMemory(Integer.toBinaryString(Integer.parseInt(IAR.getValue())), x3.getValue());

                        }
                        gui.statusTxtBox.setText("STX executed at effective address");
                        
                        gui.ldrChkBox.setSelection(false);
                        gui.ldaChkBox.setSelection(false);
                        gui.ldxChkBox.setSelection(false);
                        gui.strChkBox.setSelection(false);
                        gui.stxChkBox.setSelection(true);

                        break;
                }
                break;


                //Execution Complete
            case 10:

                gui.statusTxtBox.setText("Execution complete!");
                break;

        }
    }

}