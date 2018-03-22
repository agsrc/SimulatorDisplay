package com;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.wb.swt.SWTResourceManager;


public class GUI{

	/**Contains the User Interface Design */

	protected Shell shell;
	public Text r0TxtBox;
	public Text r1TxtBox;
	public Text r2TxtBox;
	public Text r3TxtBox;

	List<Text> gRegTextArray= new ArrayList<>();

	public Text x1TxtBox;
	public Text x2TxtBox;
	public Text x3TxtBox;

    List<Text> iRegTextArray= new ArrayList<>();

    public Text currentInstrTextBox;
	public Text memDataTextBox;
	public Text currentAddTxtBox;
	public Text statusTxtBox;
	public Text irTxtBox;
	public Text marTxtBox;
	public Text mbrTxtBox;
	public Text ccTxtBox;
	public Text mfrTxtBox;
	public Text pcTxtBox;
	public Text raTxtBox;
	public Text iarTxtBox;
	public Text irrTxtBox;
	public Text msrTxtBox;
    List<Button> ccButtonArray;


    Button pcRadioBtn4;
	Button pcRadioBtn6;
	Button pcRadioBtn5;
	Button pcRadioBtn11;
	Button pcRadioBtn12;
	Button pcRadioBtn10;
	Button pcRadioBtn9;
	Button pcRadioBtn8;
	Button pcRadioBtn7;
	Button pcRadioBtn2;
	Button pcRadioBtn1;
	Button pcRadioBtn3;

	Button marRadioBtn1;
	Button marRadioBtn10;
	Button marRadioBtn15;
	Button marRadioBtn16;
	Button marRadioBtn14;
	Button marRadioBtn13;
	Button marRadioBtn12;
	Button marRadioBtn11;
	Button marRadioBtn9;
	Button marRadioBtn2;
	Button marRadioBtn3;
	Button marRadioBtn5;
	Button marRadioBtn4;
	Button marRadioBtn6;
	Button marRadioBtn7;
	Button marRadioBtn8;

    List<Button> marButtonArr= new ArrayList<>();

    Button mbrRadioBtn7;
	Button mbrRadioBtn11;
	Button mbrRadioBtn15;
	Button mbrRadioBtn16;
	Button mbrRadioBtn14;
	Button mbrRadioBtn13;
	Button mbrRadioBtn12;
	Button mbrRadioBtn10;
	Button mbrRadioBtn9;
	Button mbrRadioBtn8;
	Button mbrRadioBtn6;
	Button mbrRadioBtn5;
	Button mbrRadioBtn4;
	Button mbrRadioBtn3;
	Button mbrRadioBtn2;
	Button mbrRadioBtn1;

    List<Button> mbrButtonArr= new ArrayList<>();

    Button irRadioBtn15;
	Button irRadioBtn2;
	Button irRadioBtn5;
	Button irRadioBtn1;
	Button irRadioBtn3;
	Button irRadioBtn4;
	Button irRadioBtn11;
	Button irRadioBtn10;
	Button irRadioBtn9;
	Button irRadioBtn6;
	Button irRadioBtn12;
	Button irRadioBtn8;
	Button irRadioBtn13;
	Button irRadioBtn7;
	Button irRadioBtn14;
	Button irRadioBtn16;

    List<Button> irButtonArr= new ArrayList<>();

    Button r0RadioBtn15;
	Button r0RadioBtn10;
	Button r0RadioBtn12;
	Button r0RadioBtn8;
	Button r0RadioBtn9;
	Button r0RadioBtn5;
	Button r0RadioBtn6;
	Button r0RadioBtn4;
	Button r0RadioBtn3;
	Button r0RadioBtn2;
	Button r0RadioBtn1;
	Button r0RadioBtn14;
	Button r0RadioBtn7;
	Button r0RadioBtn16;
	Button r0RadioBtn11;
	Button r0RadioBtn13;

    List<Button> r0ButtonArr= new ArrayList<>();

    Button r1RadioBtn2;
	Button r1RadioBtn1;
	Button r1RadioBtn3;
	Button r1RadioBtn4;
	Button r1RadioBtn5;
	Button r1RadioBtn6;
	Button r1RadioBtn7;
	Button r1RadioBtn9;
	Button r1RadioBtn8;
	Button r1RadioBtn11;
	Button r1RadioBtn10;
	Button r1RadioBtn12;
	Button r1RadioBtn16;
	Button r1RadioBtn13;
	Button r1RadioBtn14;
	Button r1RadioBtn15;

    List<Button> r1ButtonArr= new ArrayList<>();

    Button r2RadioBtn2;
	Button r2RadioBtn1;
	Button r2RadioBtn3;
	Button r2RadioBtn10;
	Button r2RadioBtn4;
	Button r2RadioBtn5;
	Button r2RadioBtn6;
	Button r2RadioBtn7;
	Button r2RadioBtn8;
	Button r2RadioBtn9;
	Button r2RadioBtn11;
	Button r2RadioBtn12;
	Button r2RadioBtn13;
	Button r2RadioBtn14;
	Button r2RadioBtn15;
	Button r2RadioBtn16;

    List<Button> r2ButtonArr= new ArrayList<>();

    Button r3RadioBtn15;
	Button r3RadioBtn12;
	Button r3RadioBtn13;
	Button r3RadioBtn6;
	Button r3RadioBtn7;
	Button r3RadioBtn9;
	Button r3RadioBtn10;
	Button r3RadioBtn11;
	Button r3RadioBtn8;
	Button r3RadioBtn14;
	Button r3RadioBtn16;
	Button r3RadioBtn3;
	Button r3RadioBtn4;
	Button r3RadioBtn2;
	Button r3RadioBtn5;
	Button r3RadioBtn1;

    List<Button> r3ButtonArr= new ArrayList<>();

	Button x1RadioBtn2;
	Button x1RadioBtn1;
	Button x1RadioBtn5;
	Button x1RadioBtn3;
	Button x1RadioBtn4;
	Button x1RadioBtn6;
	Button x1RadioBtn7;
	Button x1RadioBtn8;
	Button x1RadioBtn10;
	Button x1RadioBtn9;
	Button x1RadioBtn11;
	Button x1RadioBtn12;
	Button x1RadioBtn13;
	Button x1RadioBtn14;
	Button x1RadioBtn15;
	Button x2RadioBtn16;
	Button x1RadioBtn16;
	Button x3RadioBtn16;

    List<Button> x1ButtonArr= new ArrayList<>();

    Button x2RadioBtn14;
	Button x2RadioBtn6;
	Button x2RadioBtn13;
	Button x2RadioBtn15;
	Button x2RadioBtn5;
	Button x2RadioBtn11;
	Button x2RadioBtn12;
	Button x2RadioBtn10;
	Button x2RadioBtn9;
	Button x2RadioBtn7;
	Button x2RadioBtn8;
	Button x2RadioBtn3;
	Button x2RadioBtn4;
	Button x2RadioBtn2;
	Button x2RadioBtn1;

    List<Button> x2ButtonArr= new ArrayList<>();

    Button x3RadioBtn2;
	Button x3RadioBtn1;
	Button x3RadioBtn3;
	Button x3RadioBtn4;
	Button x3RadioBtn5;
	Button x3RadioBtn6;
	Button x3RadioBtn7;
	Button x3RadioBtn8;
	Button x3RadioBtn10;
	Button x3RadioBtn9;
	Button x3RadioBtn11;
	Button x3RadioBtn12;
	Button x3RadioBtn13;
	Button x3RadioBtn14;
	Button x3RadioBtn15;

    List<Button> x3ButtonArr= new ArrayList<>();

    Button mfrRadioBtn2;
	Button mfrRadioBtn3;
	Button mfrRadioBtn1;
	Button mfrRadioBtn4;

	Button iplBtn;


	Button currAddressRadioBtn2;

	Button currAddressRadioBtn1;
	Button currAddressRadioBtn3;
	Button currAddressRadioBtn4;
	Button currAddressRadioBtn5;
	Button currAddressRadioBtn7;
	Button currAddressRadioBtn6;
	Button currAddressRadioBtn8;
	Button currAddressRadioBtn9;
	Button currAddressRadioBtn10;
	Button currAddressRadioBtn11;
	Button currAddressRadioBtn12;

	Button currInstrRadioBtn1;
	Button currInstrRadioBtn2;
	Button currInstrRadioBtn3;
	Button currInstrRadioBtn4;
	Button currInstrRadioBtn5;
	Button currInstrRadioBtn6;
	Button currInstrRadioBtn7;
	Button currInstrRadioBtn8;
	Button currInstrRadioBtn9;
	Button currInstrRadioBtn10;
	Button currInstrRadioBtn11;
	Button currInstrRadioBtn12;
	Button currInstrRadioBtn13;
	Button currInstrRadioBtn14;
	Button currInstrRadioBtn15;
	Button currInstrRadioBtn16;

	Button memDataRadioBtn1;
	Button memDataRadioBtn2;
	Button memDataRadioBtn3;
	Button memDataRadioBtn4;
	Button memDataRadioBtn5;
	Button memDataRadioBtn6;
	Button memDataRadioBtn7;
	Button memDataRadioBtn8;
	Button memDataRadioBtn9;
	Button memDataRadioBtn10;
	Button memDataRadioBtn11;
	Button memDataRadioBtn12;
	Button memDataRadioBtn13;
	Button memDataRadioBtn14;
	Button memDataRadioBtn15;
	Button memDataRadioBtn16;
	Button ldrChkBox;
	Button ldaChkBox;
	Button ldxChkBox;
	Button strChkBox;
	Button stxChkBox;
	Button singleStepBtn;
	Button standardBtn;

	Button r0ChkBox;
	Button r1ChkBox;
	Button r2ChkBox;
	Button r3ChkBox;

    List<Button> rChkArr= new ArrayList<>();

    Button fetchBtn;

	Button x1ChkBox;
	Button x2ChkBox;
	Button x3ChkBox;
	Button prog1Btn;

    List<Button> xChkArr= new ArrayList<>();


    Listener listener;

	ArchSetup archSetup;
    ArrayList<Button> pcRadioButtonArray;

    String[] mainNumber = new String[2];
    String[] searchNumber = new String[2];
	int counter = 1;


	/**
	 * Launch the application.
	 * @paramargs
	 */
	//	void guiInit() {
	//	try {
	//	GUI window= new GUI();
	//	window.windowOpen();
	//	} catch (Exception e) {
	//	e.printStackTrace();
	//	}
	//	}

	/**
	 * Open the window.
	 */
	public void windowOpen() {
		Display display = Display.getDefault();
		archSetup = new ArchSetup();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		//shell.setImage(SWTResourceManager.getImage(Simulator.GUI.class, "/com/download.png"));
		shell.setSize(1386, 714);
		shell.setText("Simulator");

		Group group = new Group(shell, SWT.NONE);
		group.setBounds(10, 70, 420, 211);

		Label label = new Label(group, SWT.NONE);
		label.setText("General Purpose Registers");
		//label.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label.setBounds(10, 10, 185, 22);


		r0ChkBox = new Button(group, SWT.CHECK);
		r0ChkBox.setEnabled(true);
		r0ChkBox.setText("R0");
		r0ChkBox.setBounds(10, 46, 36, 16);

		r1ChkBox = new Button(group, SWT.CHECK);
		r1ChkBox.setEnabled(true);
		r1ChkBox.setText("R1");
		r1ChkBox.setBounds(10, 87, 36, 16);

		r2ChkBox = new Button(group, SWT.CHECK);
		r2ChkBox.setEnabled(true);
		r2ChkBox.setText("R2");
		r2ChkBox.setBounds(10, 128, 36, 16);

		r3ChkBox = new Button(group, SWT.CHECK);
		r3ChkBox.setEnabled(true);
		r3ChkBox.setText("R3");
		r3ChkBox.setBounds(10, 168, 36, 16);

		rChkArr.add(r0ChkBox);
		rChkArr.add(r1ChkBox);
		rChkArr.add(r2ChkBox);
		rChkArr.add(r3ChkBox);

		r0RadioBtn1 = new Button(group, SWT.RADIO);
		r0RadioBtn1.setEnabled(false);
		r0RadioBtn1.setBounds(52, 46, 13, 16);

		r0RadioBtn2 = new Button(group, SWT.RADIO);
		r0RadioBtn2.setEnabled(false);
		r0RadioBtn2.setBounds(67, 46, 13, 16);

		r0RadioBtn3 = new Button(group, SWT.RADIO);
		r0RadioBtn3.setEnabled(false);
		r0RadioBtn3.setBounds(82, 46, 13, 16);

		r0RadioBtn4 = new Button(group, SWT.RADIO);
		r0RadioBtn4.setEnabled(false);
		r0RadioBtn4.setBounds(96, 46, 13, 16);

		r0RadioBtn5 = new Button(group, SWT.RADIO);
		r0RadioBtn5.setEnabled(false);
		r0RadioBtn5.setBounds(110, 46, 13, 16);

		r0RadioBtn6 = new Button(group, SWT.RADIO);
		r0RadioBtn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		r0RadioBtn6.setEnabled(false);
		r0RadioBtn6.setBounds(124, 46, 13, 16);


		r0RadioBtn7 = new Button(group, SWT.RADIO);
		r0RadioBtn7.setEnabled(false);
		r0RadioBtn7.setBounds(139, 46, 13, 16);

		r0RadioBtn8 = new Button(group, SWT.RADIO);
		r0RadioBtn8.setEnabled(false);
		r0RadioBtn8.setBounds(154, 46, 13, 16);

		r0RadioBtn9 = new Button(group, SWT.RADIO);
		r0RadioBtn9.setEnabled(false);
		r0RadioBtn9.setBounds(168, 46, 13, 16);

		r0RadioBtn10 = new Button(group, SWT.RADIO);
		r0RadioBtn10.setEnabled(false);
		r0RadioBtn10.setBounds(182, 46, 13, 16);


		r0RadioBtn11 = new Button(group, SWT.RADIO);
		r0RadioBtn11.setEnabled(false);
		r0RadioBtn11.setBounds(196, 46, 13, 16);


		r0RadioBtn12 = new Button(group, SWT.RADIO);
		r0RadioBtn12.setEnabled(false);
		r0RadioBtn12.setBounds(210, 46, 13, 16);

		r0RadioBtn13 = new Button(group, SWT.RADIO);
		r0RadioBtn13.setEnabled(false);
		r0RadioBtn13.setBounds(224, 46, 13, 16);

		r0RadioBtn14 = new Button(group, SWT.RADIO);
		r0RadioBtn14.setEnabled(false);
		r0RadioBtn14.setBounds(239, 46, 13, 16);

		r0RadioBtn15 = new Button(group, SWT.RADIO);
		r0RadioBtn15.setEnabled(false);
		r0RadioBtn15.setBounds(254, 46, 13, 16);

		r0RadioBtn16 = new Button(group, SWT.RADIO);
		r0RadioBtn16.setEnabled(false);
		r0RadioBtn16.setBounds(268, 46, 13, 16);

		r0ButtonArr.add(r0RadioBtn1);
		r0ButtonArr.add(r0RadioBtn2);
		r0ButtonArr.add(r0RadioBtn3);
		r0ButtonArr.add(r0RadioBtn4);
		r0ButtonArr.add(r0RadioBtn5);
		r0ButtonArr.add(r0RadioBtn6);
		r0ButtonArr.add(r0RadioBtn7);
		r0ButtonArr.add(r0RadioBtn8);
		r0ButtonArr.add(r0RadioBtn9);
		r0ButtonArr.add(r0RadioBtn10);
		r0ButtonArr.add(r0RadioBtn11);
		r0ButtonArr.add(r0RadioBtn12);
		r0ButtonArr.add(r0RadioBtn13);
		r0ButtonArr.add(r0RadioBtn14);
		r0ButtonArr.add(r0RadioBtn15);
		r0ButtonArr.add(r0RadioBtn16);

		r1RadioBtn1 = new Button(group, SWT.RADIO);
		r1RadioBtn1.setEnabled(false);
		r1RadioBtn1.setBounds(52, 87, 13, 16);

		r1RadioBtn2 = new Button(group, SWT.RADIO);
		r1RadioBtn2.setEnabled(false);
		r1RadioBtn2.setBounds(67, 87, 13, 16);


		r1RadioBtn3 = new Button(group, SWT.RADIO);
		r1RadioBtn3.setEnabled(false);
		r1RadioBtn3.setBounds(82, 87, 13, 16);

		r1RadioBtn4 = new Button(group, SWT.RADIO);
		r1RadioBtn4.setEnabled(false);
		r1RadioBtn4.setBounds(96, 87, 13, 16);

		r1RadioBtn5 = new Button(group, SWT.RADIO);
		r1RadioBtn5.setEnabled(false);
		r1RadioBtn5.setBounds(110, 87, 13, 16);

		r1RadioBtn6 = new Button(group, SWT.RADIO);
		r1RadioBtn6.setEnabled(false);
		r1RadioBtn6.setBounds(124, 87, 13, 16);

		r1RadioBtn7 = new Button(group, SWT.RADIO);
		r1RadioBtn7.setEnabled(false);
		r1RadioBtn7.setBounds(139, 87, 13, 16);

		r1RadioBtn8 = new Button(group, SWT.RADIO);
		r1RadioBtn8.setEnabled(false);
		r1RadioBtn8.setBounds(154, 87, 13, 16);

		r1RadioBtn9 = new Button(group, SWT.RADIO);
		r1RadioBtn9.setEnabled(false);
		r1RadioBtn9.setBounds(168, 87, 13, 16);

		r1RadioBtn10 = new Button(group, SWT.RADIO);
		r1RadioBtn10.setEnabled(false);
		r1RadioBtn10.setBounds(182, 87, 13, 16);

		r1RadioBtn11 = new Button(group, SWT.RADIO);
		r1RadioBtn11.setEnabled(false);
		r1RadioBtn11.setBounds(196, 87, 13, 16);

		r1RadioBtn12 = new Button(group, SWT.RADIO);
		r1RadioBtn12.setEnabled(false);
		r1RadioBtn12.setBounds(210, 87, 13, 16);

		r1RadioBtn13 = new Button(group, SWT.RADIO);
		r1RadioBtn13.setEnabled(false);
		r1RadioBtn13.setBounds(224, 87, 13, 16);

		r1RadioBtn14 = new Button(group, SWT.RADIO);
		r1RadioBtn14.setEnabled(false);
		r1RadioBtn14.setBounds(239, 87, 13, 16);

		r1RadioBtn15 = new Button(group, SWT.RADIO);
		r1RadioBtn15.setEnabled(false);
		r1RadioBtn15.setBounds(254, 87, 13, 16);

		r1RadioBtn16 = new Button(group, SWT.RADIO);
		r1RadioBtn16.setEnabled(false);
		r1RadioBtn16.setBounds(268, 87, 13, 16);

		r1ButtonArr.add(r1RadioBtn1);
		r1ButtonArr.add(r1RadioBtn2);
		r1ButtonArr.add(r1RadioBtn3);
		r1ButtonArr.add(r1RadioBtn4);
		r1ButtonArr.add(r1RadioBtn5);
		r1ButtonArr.add(r1RadioBtn6);
		r1ButtonArr.add(r1RadioBtn7);
		r1ButtonArr.add(r1RadioBtn8);
		r1ButtonArr.add(r1RadioBtn9);
		r1ButtonArr.add(r1RadioBtn10);
		r1ButtonArr.add(r1RadioBtn11);
		r1ButtonArr.add(r1RadioBtn12);
		r1ButtonArr.add(r1RadioBtn13);
		r1ButtonArr.add(r1RadioBtn14);
		r1ButtonArr.add(r1RadioBtn15);
		r1ButtonArr.add(r1RadioBtn16);

		r2RadioBtn1 = new Button(group, SWT.RADIO);
		r2RadioBtn1.setEnabled(false);
		r2RadioBtn1.setBounds(52, 128, 13, 16);

		r2RadioBtn2 = new Button(group, SWT.RADIO);
		r2RadioBtn2.setEnabled(false);
		r2RadioBtn2.setBounds(67, 128, 13, 16);

		r2RadioBtn3 = new Button(group, SWT.RADIO);
		r2RadioBtn3.setEnabled(false);
		r2RadioBtn3.setBounds(82, 128, 13, 16);

		r2RadioBtn4 = new Button(group, SWT.RADIO);
		r2RadioBtn4.setEnabled(false);
		r2RadioBtn4.setBounds(96, 128, 13, 16);

		r2RadioBtn5 = new Button(group, SWT.RADIO);
		r2RadioBtn5.setEnabled(false);
		r2RadioBtn5.setBounds(110, 128, 13, 16);

		r2RadioBtn6 = new Button(group, SWT.RADIO);
		r2RadioBtn6.setEnabled(false);
		r2RadioBtn6.setBounds(124, 128, 13, 16);


		r2RadioBtn7 = new Button(group, SWT.RADIO);
		r2RadioBtn7.setEnabled(false);
		r2RadioBtn7.setBounds(139, 128, 13, 16);

		r2RadioBtn8 = new Button(group, SWT.RADIO);
		r2RadioBtn8.setEnabled(false);
		r2RadioBtn8.setBounds(154, 128, 13, 16);

		r2RadioBtn9 = new Button(group, SWT.RADIO);
		r2RadioBtn9.setEnabled(false);
		r2RadioBtn9.setBounds(168, 128, 13, 16);

		r2RadioBtn10 = new Button(group, SWT.RADIO);
		r2RadioBtn10.setEnabled(false);
		r2RadioBtn10.setBounds(182, 128, 13, 16);

		r2RadioBtn11 = new Button(group, SWT.RADIO);
		r2RadioBtn11.setEnabled(false);
		r2RadioBtn11.setBounds(196, 128, 13, 16);

		r2RadioBtn12 = new Button(group, SWT.RADIO);
		r2RadioBtn12.setEnabled(false);
		r2RadioBtn12.setBounds(210, 128, 13, 16);

		r2RadioBtn13 = new Button(group, SWT.RADIO);
		r2RadioBtn13.setEnabled(false);
		r2RadioBtn13.setBounds(224, 128, 13, 16);

		r2RadioBtn14 = new Button(group, SWT.RADIO);
		r2RadioBtn14.setEnabled(false);
		r2RadioBtn14.setBounds(239, 128, 13, 16);

		r2RadioBtn15 = new Button(group, SWT.RADIO);
		r2RadioBtn15.setEnabled(false);
		r2RadioBtn15.setBounds(254, 128, 13, 16);

		r2RadioBtn16 = new Button(group, SWT.RADIO);
		r2RadioBtn16.setEnabled(false);
		r2RadioBtn16.setBounds(268, 128, 13, 16);

		r2ButtonArr.add(r2RadioBtn1);
		r2ButtonArr.add(r2RadioBtn2);
		r2ButtonArr.add(r2RadioBtn3);
		r2ButtonArr.add(r2RadioBtn4);
		r2ButtonArr.add(r2RadioBtn5);
		r2ButtonArr.add(r2RadioBtn6);
		r2ButtonArr.add(r2RadioBtn7);
		r2ButtonArr.add(r2RadioBtn8);
		r2ButtonArr.add(r2RadioBtn9);
		r2ButtonArr.add(r2RadioBtn10);
		r2ButtonArr.add(r2RadioBtn11);
		r2ButtonArr.add(r2RadioBtn12);
		r2ButtonArr.add(r2RadioBtn13);
		r2ButtonArr.add(r2RadioBtn14);
		r2ButtonArr.add(r2RadioBtn15);
		r2ButtonArr.add(r2RadioBtn16);

		r3RadioBtn1 = new Button(group, SWT.RADIO);
		r3RadioBtn1.setEnabled(false);
		r3RadioBtn1.setBounds(52, 168, 13, 16);

		r3RadioBtn2 = new Button(group, SWT.RADIO);
		r3RadioBtn2.setEnabled(false);
		r3RadioBtn2.setBounds(67, 168, 13, 16);

		r3RadioBtn3 = new Button(group, SWT.RADIO);
		r3RadioBtn3.setEnabled(false);
		r3RadioBtn3.setBounds(82, 168, 13, 16);

		r3RadioBtn4 = new Button(group, SWT.RADIO);
		r3RadioBtn4.setEnabled(false);
		r3RadioBtn4.setBounds(96, 168, 13, 16);

		r3RadioBtn5 = new Button(group, SWT.RADIO);
		r3RadioBtn5.setEnabled(false);
		r3RadioBtn5.setBounds(110, 168, 13, 16);

		r3RadioBtn6 = new Button(group, SWT.RADIO);
		r3RadioBtn6.setEnabled(false);
		r3RadioBtn6.setBounds(124, 168, 13, 16);

		r3RadioBtn7 = new Button(group, SWT.RADIO);
		r3RadioBtn7.setEnabled(false);
		r3RadioBtn7.setBounds(139, 168, 13, 16);

		r3RadioBtn8 = new Button(group, SWT.RADIO);
		r3RadioBtn8.setEnabled(false);
		r3RadioBtn8.setBounds(154, 168, 13, 16);

		r3RadioBtn9 = new Button(group, SWT.RADIO);
		r3RadioBtn9.setEnabled(false);
		r3RadioBtn9.setBounds(168, 168, 13, 16);

		r3RadioBtn10 = new Button(group, SWT.RADIO);
		r3RadioBtn10.setEnabled(false);
		r3RadioBtn10.setBounds(182, 168, 13, 16);

		r3RadioBtn11 = new Button(group, SWT.RADIO);
		r3RadioBtn11.setEnabled(false);
		r3RadioBtn11.setBounds(196, 168, 13, 16);

		r3RadioBtn12 = new Button(group, SWT.RADIO);
		r3RadioBtn12.setEnabled(false);
		r3RadioBtn12.setBounds(210, 168, 13, 16);

		r3RadioBtn13 = new Button(group, SWT.RADIO);
		r3RadioBtn13.setEnabled(false);
		r3RadioBtn13.setBounds(224, 168, 13, 16);


		r3RadioBtn14 = new Button(group, SWT.RADIO);
		r3RadioBtn14.setEnabled(false);
		r3RadioBtn14.setBounds(239, 168, 13, 16);



		r3RadioBtn15 = new Button(group, SWT.RADIO);
		r3RadioBtn15.setEnabled(false);
		r3RadioBtn15.setBounds(254, 168, 13, 16);

		r3RadioBtn16 = new Button(group, SWT.RADIO);
		r3RadioBtn16.setEnabled(false);
		r3RadioBtn16.setBounds(268, 168, 13, 16);

		r3ButtonArr.add(r3RadioBtn1);
		r3ButtonArr.add(r3RadioBtn2);
		r3ButtonArr.add(r3RadioBtn3);
		r3ButtonArr.add(r3RadioBtn4);
		r3ButtonArr.add(r3RadioBtn5);
		r3ButtonArr.add(r3RadioBtn6);
		r3ButtonArr.add(r3RadioBtn7);
		r3ButtonArr.add(r3RadioBtn8);
		r3ButtonArr.add(r3RadioBtn9);
		r3ButtonArr.add(r3RadioBtn10);
		r3ButtonArr.add(r3RadioBtn11);
		r3ButtonArr.add(r3RadioBtn12);
		r3ButtonArr.add(r3RadioBtn13);
		r3ButtonArr.add(r3RadioBtn14);
		r3ButtonArr.add(r3RadioBtn15);
		r3ButtonArr.add(r3RadioBtn16);

		r0TxtBox = new Text(group, SWT.BORDER);
		r0TxtBox.setEnabled(true);
		r0TxtBox.setBounds(287, 44, 123, 21);

		r1TxtBox = new Text(group, SWT.BORDER);
		r1TxtBox.setEnabled(true);
		r1TxtBox.setBounds(287, 82, 123, 21);

		r2TxtBox = new Text(group, SWT.BORDER);
		r2TxtBox.setEnabled(true);
		r2TxtBox.setBounds(287, 123, 123, 21);

		r3TxtBox = new Text(group, SWT.BORDER);
		r3TxtBox.setEnabled(true);
		r3TxtBox.setBounds(287, 163, 123, 21);

        gRegTextArray.add(r0TxtBox);
        gRegTextArray.add(r1TxtBox);
        gRegTextArray.add(r2TxtBox);
        gRegTextArray.add(r3TxtBox);

		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBounds(10, 294, 420, 192);

		Label label_1 = new Label(group_1, SWT.NONE);
		label_1.setText("Index Registers");
		//label_1.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label_1.setBounds(10, 10, 127, 22);

		x1ChkBox = new Button(group_1, SWT.CHECK);
		x1ChkBox.setText("X1");
		x1ChkBox.setBounds(10, 52, 36, 16);

		x1RadioBtn1 = new Button(group_1, SWT.RADIO);
		x1RadioBtn1.setEnabled(false);
		x1RadioBtn1.setBounds(52, 52, 13, 16);

		x1RadioBtn2 = new Button(group_1, SWT.RADIO);
		x1RadioBtn2.setEnabled(false);
		x1RadioBtn2.setBounds(67, 52, 13, 16);

		x1RadioBtn3 = new Button(group_1, SWT.RADIO);
		x1RadioBtn3.setEnabled(false);
		x1RadioBtn3.setBounds(82, 52, 13, 16);

		x1RadioBtn4 = new Button(group_1, SWT.RADIO);
		x1RadioBtn4.setEnabled(false);
		x1RadioBtn4.setBounds(96, 52, 13, 16);

		x1RadioBtn5 = new Button(group_1, SWT.RADIO);
		x1RadioBtn5.setEnabled(false);
		x1RadioBtn5.setBounds(110, 52, 13, 16);

		x1RadioBtn6 = new Button(group_1, SWT.RADIO);
		x1RadioBtn6.setEnabled(false);
		x1RadioBtn6.setBounds(125, 52, 13, 16);

		x1RadioBtn7 = new Button(group_1, SWT.RADIO);
		x1RadioBtn7.setEnabled(false);
		x1RadioBtn7.setBounds(140, 52, 13, 16);

		x1RadioBtn8 = new Button(group_1, SWT.RADIO);
		x1RadioBtn8.setEnabled(false);
		x1RadioBtn8.setBounds(154, 52, 13, 16);

		x1RadioBtn10 = new Button(group_1, SWT.RADIO);
		x1RadioBtn10.setEnabled(false);
		x1RadioBtn10.setBounds(182, 52, 13, 16);

		x1RadioBtn9 = new Button(group_1, SWT.RADIO);
		x1RadioBtn9.setEnabled(false);
		x1RadioBtn9.setBounds(168, 52, 13, 16);

		x1RadioBtn11 = new Button(group_1, SWT.RADIO);
		x1RadioBtn11.setEnabled(false);
		x1RadioBtn11.setBounds(196, 52, 13, 16);

		x1RadioBtn12 = new Button(group_1, SWT.RADIO);
		x1RadioBtn12.setEnabled(false);
		x1RadioBtn12.setBounds(210, 52, 13, 16);

		x1RadioBtn13 = new Button(group_1, SWT.RADIO);
		x1RadioBtn13.setEnabled(false);
		x1RadioBtn13.setBounds(225, 52, 13, 16);

		x1RadioBtn14 = new Button(group_1, SWT.RADIO);
		x1RadioBtn14.setEnabled(false);
		x1RadioBtn14.setBounds(240, 52, 13, 16);

		x1RadioBtn15 = new Button(group_1, SWT.RADIO);
		x1RadioBtn15.setEnabled(false);
		x1RadioBtn15.setBounds(254, 52, 13, 16);


		x1TxtBox = new Text(group_1, SWT.BORDER);
		x1TxtBox.setBounds(287, 47, 123, 21);

		x2ChkBox = new Button(group_1, SWT.CHECK);
		x2ChkBox.setText("X2");
		x2ChkBox.setBounds(10, 97, 36, 16);

		x2RadioBtn1 = new Button(group_1, SWT.RADIO);
		x2RadioBtn1.setEnabled(false);
		x2RadioBtn1.setBounds(52, 97, 13, 16);

		x2RadioBtn2 = new Button(group_1, SWT.RADIO);
		x2RadioBtn2.setEnabled(false);
		x2RadioBtn2.setBounds(67, 97, 13, 16);

		x2RadioBtn3 = new Button(group_1, SWT.RADIO);
		x2RadioBtn3.setEnabled(false);
		x2RadioBtn3.setBounds(82, 97, 13, 16);

		x2RadioBtn4 = new Button(group_1, SWT.RADIO);
		x2RadioBtn4.setEnabled(false);
		x2RadioBtn4.setBounds(96, 97, 13, 16);

		x2RadioBtn5 = new Button(group_1, SWT.RADIO);
		x2RadioBtn5.setEnabled(false);
		x2RadioBtn5.setBounds(110, 97, 13, 16);

		x2RadioBtn6 = new Button(group_1, SWT.RADIO);
		x2RadioBtn6.setEnabled(false);
		x2RadioBtn6.setBounds(125, 97, 13, 16);

		x2RadioBtn7 = new Button(group_1, SWT.RADIO);
		x2RadioBtn7.setEnabled(false);
		x2RadioBtn7.setBounds(140, 97, 13, 16);

		x2RadioBtn8 = new Button(group_1, SWT.RADIO);
		x2RadioBtn8.setEnabled(false);
		x2RadioBtn8.setBounds(154, 97, 13, 16);

		x2RadioBtn10 = new Button(group_1, SWT.RADIO);
		x2RadioBtn10.setEnabled(false);
		x2RadioBtn10.setBounds(182, 97, 13, 16);


		x2RadioBtn9 = new Button(group_1, SWT.RADIO);
		x2RadioBtn9.setEnabled(false);
		x2RadioBtn9.setBounds(168, 97, 13, 16);

		x2RadioBtn11 = new Button(group_1, SWT.RADIO);
		x2RadioBtn11.setEnabled(false);
		x2RadioBtn11.setBounds(196, 97, 13, 16);

		x2RadioBtn12 = new Button(group_1, SWT.RADIO);
		x2RadioBtn12.setEnabled(false);
		x2RadioBtn12.setBounds(210, 97, 13, 16);

		x2RadioBtn13 = new Button(group_1, SWT.RADIO);
		x2RadioBtn13.setEnabled(false);
		x2RadioBtn13.setBounds(225, 97, 13, 16);

		x2RadioBtn14 = new Button(group_1, SWT.RADIO);
		x2RadioBtn14.setEnabled(false);
		x2RadioBtn14.setBounds(240, 97, 13, 16);

		x2RadioBtn15 = new Button(group_1, SWT.RADIO);
		x2RadioBtn15.setEnabled(false);
		x2RadioBtn15.setBounds(254, 97, 13, 16);

		x2TxtBox = new Text(group_1, SWT.BORDER);
		x2TxtBox.setBounds(287, 92, 123, 21);

		x3ChkBox = new Button(group_1, SWT.CHECK);
		x3ChkBox.setText("X3");
		x3ChkBox.setBounds(10, 139, 36, 16);

		x3RadioBtn1 = new Button(group_1, SWT.RADIO);
		x3RadioBtn1.setEnabled(false);
		x3RadioBtn1.setBounds(52, 139, 13, 16);

		x3RadioBtn2 = new Button(group_1, SWT.RADIO);
		x3RadioBtn2.setEnabled(false);
		x3RadioBtn2.setBounds(67, 139, 13, 16);

		x3RadioBtn3 = new Button(group_1, SWT.RADIO);
		x3RadioBtn3.setEnabled(false);
		x3RadioBtn3.setBounds(82, 139, 13, 16);

		x3RadioBtn4 = new Button(group_1, SWT.RADIO);
		x3RadioBtn4.setEnabled(false);
		x3RadioBtn4.setBounds(96, 139, 13, 16);

		x3RadioBtn5 = new Button(group_1, SWT.RADIO);
		x3RadioBtn5.setEnabled(false);
		x3RadioBtn5.setBounds(110, 139, 13, 16);

		x3RadioBtn6 = new Button(group_1, SWT.RADIO);
		x3RadioBtn6.setEnabled(false);
		x3RadioBtn6.setBounds(125, 139, 13, 16);

		x3RadioBtn7 = new Button(group_1, SWT.RADIO);
		x3RadioBtn7.setEnabled(false);
		x3RadioBtn7.setBounds(140, 139, 13, 16);

		x3RadioBtn8 = new Button(group_1, SWT.RADIO);
		x3RadioBtn8.setEnabled(false);
		x3RadioBtn8.setBounds(154, 139, 13, 16);

		x3RadioBtn10 = new Button(group_1, SWT.RADIO);
		x3RadioBtn10.setEnabled(false);
		x3RadioBtn10.setBounds(182, 139, 13, 16);

		x3RadioBtn9 = new Button(group_1, SWT.RADIO);
		x3RadioBtn9.setEnabled(false);
		x3RadioBtn9.setBounds(168, 139, 13, 16);

		x3RadioBtn11 = new Button(group_1, SWT.RADIO);
		x3RadioBtn11.setEnabled(false);
		x3RadioBtn11.setBounds(196, 139, 13, 16);

		x3RadioBtn12 = new Button(group_1, SWT.RADIO);
		x3RadioBtn12.setEnabled(false);
		x3RadioBtn12.setBounds(210, 139, 13, 16);

		x3RadioBtn13 = new Button(group_1, SWT.RADIO);
		x3RadioBtn13.setEnabled(false);
		x3RadioBtn13.setBounds(225, 139, 13, 16);

		x3RadioBtn14 = new Button(group_1, SWT.RADIO);
		x3RadioBtn14.setEnabled(false);
		x3RadioBtn14.setBounds(240, 139, 13, 16);

		x3RadioBtn15 = new Button(group_1, SWT.RADIO);
		x3RadioBtn15.setEnabled(false);
		x3RadioBtn15.setBounds(254, 139, 13, 16);

		x3TxtBox = new Text(group_1, SWT.BORDER);
		x3TxtBox.setBounds(287, 134, 123, 21);

		x1RadioBtn16 = new Button(group_1, SWT.RADIO);
		x1RadioBtn16.setEnabled(false);
		x1RadioBtn16.setBounds(268, 52, 13, 16);

		x2RadioBtn16 = new Button(group_1, SWT.RADIO);
		x2RadioBtn16.setEnabled(false);
		x2RadioBtn16.setBounds(268, 97, 13, 16);

		x3RadioBtn16 = new Button(group_1, SWT.RADIO);
		x3RadioBtn16.setEnabled(false);
		x3RadioBtn16.setBounds(268, 139, 13, 16);

        x1ButtonArr.add(x1RadioBtn1);
        x1ButtonArr.add(x1RadioBtn2);
        x1ButtonArr.add(x1RadioBtn3);
        x1ButtonArr.add(x1RadioBtn4);
        x1ButtonArr.add(x1RadioBtn5);
        x1ButtonArr.add(x1RadioBtn6);
        x1ButtonArr.add(x1RadioBtn7);
        x1ButtonArr.add(x1RadioBtn8);
        x1ButtonArr.add(x1RadioBtn9);
        x1ButtonArr.add(x1RadioBtn10);
        x1ButtonArr.add(x1RadioBtn11);
        x1ButtonArr.add(x1RadioBtn12);
        x1ButtonArr.add(x1RadioBtn13);
        x1ButtonArr.add(x1RadioBtn14);
        x1ButtonArr.add(x1RadioBtn15);
        x1ButtonArr.add(x1RadioBtn16);

        x2ButtonArr.add(x2RadioBtn1);
        x2ButtonArr.add(x2RadioBtn2);
        x2ButtonArr.add(x2RadioBtn3);
        x2ButtonArr.add(x2RadioBtn4);
        x2ButtonArr.add(x2RadioBtn5);
        x2ButtonArr.add(x2RadioBtn6);
        x2ButtonArr.add(x2RadioBtn7);
        x2ButtonArr.add(x2RadioBtn8);
        x2ButtonArr.add(x2RadioBtn9);
        x2ButtonArr.add(x2RadioBtn10);
        x2ButtonArr.add(x2RadioBtn11);
        x2ButtonArr.add(x2RadioBtn12);
        x2ButtonArr.add(x2RadioBtn13);
        x2ButtonArr.add(x2RadioBtn14);
        x2ButtonArr.add(x2RadioBtn15);
        x2ButtonArr.add(x2RadioBtn16);

        x3ButtonArr.add(x3RadioBtn1);
        x3ButtonArr.add(x3RadioBtn2);
        x3ButtonArr.add(x3RadioBtn3);
        x3ButtonArr.add(x3RadioBtn4);
        x3ButtonArr.add(x3RadioBtn5);
        x3ButtonArr.add(x3RadioBtn6);
        x3ButtonArr.add(x3RadioBtn7);
        x3ButtonArr.add(x3RadioBtn8);
        x3ButtonArr.add(x3RadioBtn9);
        x3ButtonArr.add(x3RadioBtn10);
        x3ButtonArr.add(x3RadioBtn11);
        x3ButtonArr.add(x3RadioBtn12);
        x3ButtonArr.add(x3RadioBtn13);
        x3ButtonArr.add(x3RadioBtn14);
        x3ButtonArr.add(x3RadioBtn15);
        x3ButtonArr.add(x3RadioBtn16);



        Group group_2 = new Group(shell, SWT.NONE);
		group_2.setBounds(436, 70, 520, 211);

		Label label_2 = new Label(group_2, SWT.NONE);
		label_2.setText("Main Memory");
		//label_2.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label_2.setBounds(209, 10, 114, 25);

		Label label_3 = new Label(group_2, SWT.NONE);
		label_3.setText("Current Address");
		label_3.setBounds(16, 47, 100, 15);
		ButtonGroup buttonGroup = new ButtonGroup();

		currAddressRadioBtn2 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn2.setEnabled(false);
		currAddressRadioBtn2.setBounds(137, 46, 13, 16);

		currAddressRadioBtn3 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn3.setEnabled(false);
		currAddressRadioBtn3.setBounds(152, 46, 13, 16);

		currAddressRadioBtn4 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn4.setEnabled(false);
		currAddressRadioBtn4.setBounds(166, 46, 13, 16);

		currAddressRadioBtn5 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn5.setEnabled(false);
		currAddressRadioBtn5.setBounds(180, 46, 13, 16);

		currAddressRadioBtn7 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn7.setEnabled(false);
		currAddressRadioBtn7.setBounds(209, 46, 13, 16);

		currAddressRadioBtn6 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn6.setEnabled(false);
		currAddressRadioBtn6.setBounds(194, 46, 13, 16);

		currAddressRadioBtn8 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn8.setEnabled(false);
		currAddressRadioBtn8.setBounds(224, 46, 13, 16);

		currAddressRadioBtn9 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn9.setEnabled(false);
		currAddressRadioBtn9.setBounds(238, 46, 13, 16);

		currAddressRadioBtn10 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn10.setEnabled(false);
		currAddressRadioBtn10.setBounds(252, 46, 13, 16);

		currAddressRadioBtn11 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn11.setEnabled(false);
		currAddressRadioBtn11.setBounds(266, 46, 13, 16);

		currAddressRadioBtn12 = new Button(group_2, SWT.RADIO);
		currAddressRadioBtn12.setEnabled(false);
		currAddressRadioBtn12.setBounds(280, 46, 13, 16);

		Label label_4 = new Label(group_2, SWT.NONE);
		label_4.setText("Current Instruction");
		label_4.setBounds(16, 88, 100, 15);

		currInstrRadioBtn1 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn1.setEnabled(false);
		currInstrRadioBtn1.setBounds(122, 87, 13, 16);

		currInstrRadioBtn2 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn2.setEnabled(false);
		currInstrRadioBtn2.setBounds(137, 87, 13, 16);

		currInstrRadioBtn3 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn3.setEnabled(false);
		currInstrRadioBtn3.setBounds(152, 87, 13, 16);

		currInstrRadioBtn4 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn4.setEnabled(false);
		currInstrRadioBtn4.setBounds(166, 87, 13, 16);

		currInstrRadioBtn5 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn5.setEnabled(false);
		currInstrRadioBtn5.setBounds(180, 87, 13, 16);

		currInstrRadioBtn6 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn6.setEnabled(false);
		currInstrRadioBtn6.setBounds(195, 87, 13, 16);

		currInstrRadioBtn7 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn7.setEnabled(false);
		currInstrRadioBtn7.setBounds(209, 87, 13, 16);

		currInstrRadioBtn8 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn8.setEnabled(false);
		currInstrRadioBtn8.setBounds(224, 87, 13, 16);

		currInstrRadioBtn9 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn9.setEnabled(false);
		currInstrRadioBtn9.setBounds(238, 87, 13, 16);

		currInstrRadioBtn10 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn10.setEnabled(false);
		currInstrRadioBtn10.setBounds(252, 87, 13, 16);

		currInstrRadioBtn11 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn11.setEnabled(false);
		currInstrRadioBtn11.setBounds(266, 87, 13, 16);

		currInstrRadioBtn12 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn12.setEnabled(false);
		currInstrRadioBtn12.setBounds(280, 87, 13, 16);

		currInstrRadioBtn13 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn13.setEnabled(false);
		currInstrRadioBtn13.setBounds(295, 87, 13, 16);

		currInstrRadioBtn14 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn14.setEnabled(false);
		currInstrRadioBtn14.setBounds(310, 87, 13, 16);

		currInstrRadioBtn15 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn15.setEnabled(false);
		currInstrRadioBtn15.setBounds(324, 87, 13, 16);

		currInstrRadioBtn16 = new Button(group_2, SWT.RADIO);
		currInstrRadioBtn16.setEnabled(false);
		currInstrRadioBtn16.setBounds(338, 87, 13, 16);

		memDataRadioBtn1 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn1.setEnabled(false);
		memDataRadioBtn1.setBounds(122, 128, 13, 16);

		memDataRadioBtn2 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn2.setEnabled(false);
		memDataRadioBtn2.setBounds(137, 128, 13, 16);

		memDataRadioBtn3 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn3.setEnabled(false);
		memDataRadioBtn3.setBounds(152, 128, 13, 16);

		memDataRadioBtn4 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn4.setEnabled(false);
		memDataRadioBtn4.setBounds(166, 128, 13, 16);

		memDataRadioBtn5 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn5.setEnabled(false);
		memDataRadioBtn5.setBounds(180, 128, 13, 16);

		memDataRadioBtn6 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn6.setEnabled(false);
		memDataRadioBtn6.setBounds(195, 128, 13, 16);

		memDataRadioBtn7 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn7.setEnabled(false);
		memDataRadioBtn7.setBounds(210, 128, 13, 16);

		memDataRadioBtn8 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn8.setEnabled(false);
		memDataRadioBtn8.setBounds(224, 128, 13, 16);

		memDataRadioBtn9 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn9.setEnabled(false);
		memDataRadioBtn9.setBounds(238, 128, 13, 16);

		memDataRadioBtn10 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn10.setEnabled(false);
		memDataRadioBtn10.setBounds(252, 128, 13, 16);

		memDataRadioBtn11 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn11.setEnabled(false);
		memDataRadioBtn11.setBounds(266, 128, 13, 16);

		memDataRadioBtn12 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn12.setEnabled(false);
		memDataRadioBtn12.setBounds(280, 128, 13, 16);

		memDataRadioBtn13 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn13.setEnabled(false);
		memDataRadioBtn13.setBounds(295, 128, 13, 16);

		memDataRadioBtn14 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn14.setEnabled(false);
		memDataRadioBtn14.setBounds(310, 128, 13, 16);

		memDataRadioBtn15 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn15.setEnabled(false);
		memDataRadioBtn15.setBounds(324, 128, 13, 16);

		memDataRadioBtn16 = new Button(group_2, SWT.RADIO);
		memDataRadioBtn16.setEnabled(false);
		memDataRadioBtn16.setBounds(338, 128, 13, 16);

		currentInstrTextBox = new Text(group_2, SWT.BORDER);
		currentInstrTextBox.setBounds(357, 82, 153, 21);
//		String RESULT= fetchInstructions(currentInstrTextBox);

		memDataTextBox = new Text(group_2, SWT.BORDER);
		memDataTextBox.setBounds(357, 123, 153, 21);

		currentAddTxtBox = new Text(group_2, SWT.BORDER);
		currentAddTxtBox.setBounds(357, 41, 153, 21);

		Label label_5 = new Label(group_2, SWT.NONE);
		label_5.setText("Memory Data");
		label_5.setBounds(16, 129, 100, 15);

		currAddressRadioBtn1 = new Button( group_2,SWT.RADIO);
		currAddressRadioBtn1.setBounds(122, 46, 13, 16);
		currAddressRadioBtn1.setEnabled(false);
		
				ldxChkBox = new Button(group_2, SWT.CHECK);
				ldxChkBox.setBounds(230, 172, 47, 16);
				ldxChkBox.setText("LDX");
				
						ldrChkBox = new Button(group_2, SWT.CHECK);
						ldrChkBox.setBounds(168, 172, 47, 16);
						ldrChkBox.setText("LDR");
						
								ldaChkBox = new Button(group_2, SWT.CHECK);
								ldaChkBox.setBounds(287, 172, 47, 16);
								ldaChkBox.setText("LDA");
								
										strChkBox = new Button(group_2, SWT.CHECK);
										strChkBox.setBounds(344, 172, 47, 16);
										strChkBox.setText("STR");
										
												stxChkBox = new Button(group_2, SWT.CHECK);
												stxChkBox.setBounds(396, 172, 55, 16);
												stxChkBox.setText("STX");
												
												Label lblOperations = new Label(group_2, SWT.NONE);
												lblOperations.setBounds(85, 173, 65, 15);
												lblOperations.setText("Operations");

		Group group_3 = new Group(shell, SWT.NONE);
		group_3.setBounds(436, 294, 520, 371);
		
				Label lblInput = new Label(group_3, SWT.NONE);
				lblInput.setBounds(23, 22, 43, 15);
				lblInput.setText("Status");
				
						statusTxtBox = new Text(group_3, SWT.BORDER);
						statusTxtBox.setBounds(23, 43, 473, 318);

		Group group_4 = new Group(shell, SWT.NONE);
		group_4.setBounds(10, 504, 420, 161);

		standardBtn = new Button(group_4, SWT.NONE);
		standardBtn.setText("Standard");
		standardBtn.setBounds(10, 44, 75, 25);
		standardBtn.setEnabled(false);

		singleStepBtn = new Button(group_4, SWT.NONE);
		singleStepBtn.setText("Single Step");
		singleStepBtn.setBounds(106, 44, 75, 25);
		singleStepBtn.setEnabled(false);

		iplBtn = new Button(group_4, SWT.NONE);
		iplBtn.setText("IPL");
		iplBtn.setBounds(199, 44, 75, 25);

		iplBtn.addSelectionListener(new SelectionAdapter() {
 			@Override
 			public void widgetSelected(SelectionEvent e) {
                			}
 		});


		fetchBtn = new Button(group_4, SWT.NONE);
		fetchBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});

		Button haltBtn = new Button(group_4, SWT.NONE);
		haltBtn.setText("Halt");
		haltBtn.setBounds(106, 106, 75, 25);

		Button clearBtn = new Button(group_4, SWT.NONE);
		clearBtn.setText("Clear");
		clearBtn.setBounds(199, 106, 75, 25);

		Label label_10 = new Label(group_4, SWT.NONE);
		label_10.setText("Execution");
		//label_10.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label_10.setBounds(10, 10, 85, 28);

        fetchBtn = new Button(group_4, SWT.NONE);
        		fetchBtn.addSelectionListener(new SelectionAdapter() {
 			@Override
 		public void widgetSelected(SelectionEvent e) {
                			}
 		});
        		fetchBtn.setBounds(10, 106, 75, 25);
        		fetchBtn.setText("Fetch");
        		
        		prog1Btn = new Button(group_4, SWT.NONE);
        		prog1Btn.setBounds(293, 76, 103, 25);
        		prog1Btn.setText("Run Program 1");

		Group group_5 = new Group(shell, SWT.NONE);
		group_5.setBounds(962, 70, 398, 595);

		Label label_11 = new Label(group_5, SWT.NONE);
		label_11.setText("CPU Registers");
		//label_11.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label_11.setBounds(27, 10, 125, 22);

		Label label_12 = new Label(group_5, SWT.NONE);
		label_12.setText("CC");
		label_12.setBounds(30, 49, 36, 15);

		Button ccRadioBtn1 = new Button(group_5, SWT.RADIO);
		ccRadioBtn1.setEnabled(false);
		ccRadioBtn1.setBounds(70, 48, 13, 16);

		Button ccRadioBtn2 = new Button(group_5, SWT.RADIO);
		ccRadioBtn2.setEnabled(false);
		ccRadioBtn2.setBounds(85, 48, 13, 16);

		Button ccRadioBtn3 = new Button(group_5, SWT.RADIO);
		ccRadioBtn3.setEnabled(false);
		ccRadioBtn3.setBounds(100, 48, 13, 16);

		Button ccRadioBtn4 = new Button(group_5, SWT.RADIO);
		ccRadioBtn4.setEnabled(false);
		ccRadioBtn4.setBounds(114, 48, 13, 16);

        ccButtonArray = new ArrayList<>();
        ccButtonArray.add(ccRadioBtn1);
		ccButtonArray.add(ccRadioBtn2);
		ccButtonArray.add(ccRadioBtn3);
		ccButtonArray.add(ccRadioBtn4);

		Label label_13 = new Label(group_5, SWT.NONE);
		label_13.setText("MFR");
		label_13.setBounds(30, 90, 36, 15);

		mfrRadioBtn1 = new Button(group_5, SWT.RADIO);
		mfrRadioBtn1.setEnabled(false);
		mfrRadioBtn1.setBounds(70, 89, 13, 16);

		mfrRadioBtn2 = new Button(group_5, SWT.RADIO);
		mfrRadioBtn2.setEnabled(false);
		mfrRadioBtn2.setBounds(85, 89, 13, 16);

		mfrRadioBtn3 = new Button(group_5, SWT.RADIO);
		mfrRadioBtn3.setEnabled(false);
		mfrRadioBtn3.setBounds(100, 89, 13, 16);

		mfrRadioBtn4 = new Button(group_5, SWT.RADIO);
		mfrRadioBtn4.setEnabled(false);
		mfrRadioBtn4.setBounds(114, 89, 13, 16);

        pcRadioButtonArray = new ArrayList<>();

        pcRadioBtn1 = new Button(group_5, SWT.RADIO);
		pcRadioBtn1.setEnabled(false);
		pcRadioBtn1.setBounds(70, 130, 13, 16);



		pcRadioBtn2 = new Button(group_5, SWT.RADIO);
		pcRadioBtn2.setEnabled(false);
		pcRadioBtn2.setBounds(85, 130, 13, 16);

		pcRadioBtn3 = new Button(group_5, SWT.RADIO);
		pcRadioBtn3.setEnabled(false);
		pcRadioBtn3.setBounds(100, 130, 13, 16);

		pcRadioBtn4 = new Button(group_5, SWT.RADIO);
		pcRadioBtn4.setEnabled(false);
		pcRadioBtn4.setBounds(114, 130, 13, 16);

		pcRadioBtn5 = new Button(group_5, SWT.RADIO);
		pcRadioBtn5.setEnabled(false);
		pcRadioBtn5.setBounds(128, 130, 13, 16);

		pcRadioBtn6 = new Button(group_5, SWT.RADIO);
		pcRadioBtn6.setEnabled(false);
		pcRadioBtn6.setBounds(142, 130, 13, 16);

		pcRadioBtn7 = new Button(group_5, SWT.RADIO);
		pcRadioBtn7.setEnabled(false);
		pcRadioBtn7.setBounds(157, 130, 13, 16);

		pcRadioBtn8 = new Button(group_5, SWT.RADIO);
		pcRadioBtn8.setEnabled(false);
		pcRadioBtn8.setBounds(172, 130, 13, 16);

		pcRadioBtn9 = new Button(group_5, SWT.RADIO);
		pcRadioBtn9.setEnabled(false);
		pcRadioBtn9.setBounds(186, 130, 13, 16);

		pcRadioBtn10 = new Button(group_5, SWT.RADIO);
		pcRadioBtn10.setEnabled(false);
		pcRadioBtn10.setBounds(200, 130, 13, 16);

		pcRadioBtn11 = new Button(group_5, SWT.RADIO);
		pcRadioBtn11.setEnabled(false);
		pcRadioBtn11.setBounds(214, 130, 13, 16);

		pcRadioBtn12 = new Button(group_5, SWT.RADIO);
		pcRadioBtn12.setEnabled(false);
		pcRadioBtn12.setBounds(228, 130, 13, 16);

        pcRadioButtonArray.add(pcRadioBtn1);
        pcRadioButtonArray.add(pcRadioBtn2);
        pcRadioButtonArray.add(pcRadioBtn3);
        pcRadioButtonArray.add(pcRadioBtn4);
        pcRadioButtonArray.add(pcRadioBtn5);
        pcRadioButtonArray.add(pcRadioBtn6);
        pcRadioButtonArray.add(pcRadioBtn7);
        pcRadioButtonArray.add(pcRadioBtn8);
        pcRadioButtonArray.add(pcRadioBtn9);
        pcRadioButtonArray.add(pcRadioBtn10);
        pcRadioButtonArray.add(pcRadioBtn11);
        pcRadioButtonArray.add(pcRadioBtn12);

        xChkArr.add(x1ChkBox);
        xChkArr.add(x2ChkBox);
        xChkArr.add(x3ChkBox);

		Button raRadioBtn1 = new Button(group_5, SWT.RADIO);
		raRadioBtn1.setEnabled(false);
		raRadioBtn1.setBounds(70, 170, 13, 16);

		Button raRadioBtn2 = new Button(group_5, SWT.RADIO);
		raRadioBtn2.setEnabled(false);
		raRadioBtn2.setBounds(85, 170, 13, 16);

		Button raRadioBtn3 = new Button(group_5, SWT.RADIO);
		raRadioBtn3.setEnabled(false);
		raRadioBtn3.setBounds(100, 170, 13, 16);

		Button raRadioBtn4 = new Button(group_5, SWT.RADIO);
		raRadioBtn4.setEnabled(false);
		raRadioBtn4.setBounds(114, 170, 13, 16);

		Button raRadioBtn5 = new Button(group_5, SWT.RADIO);
		raRadioBtn5.setEnabled(false);
		raRadioBtn5.setBounds(128, 170, 13, 16);

		Button raRadioBtn6 = new Button(group_5, SWT.RADIO);
		raRadioBtn6.setEnabled(false);
		raRadioBtn6.setBounds(142, 170, 13, 16);

		Button raRadioBtn7 = new Button(group_5, SWT.RADIO);
		raRadioBtn7.setEnabled(false);
		raRadioBtn7.setBounds(157, 170, 13, 16);

		Button raRadioBtn8 = new Button(group_5, SWT.RADIO);
		raRadioBtn8.setEnabled(false);
		raRadioBtn8.setBounds(172, 170, 13, 16);

		Button raRadioBtn9 = new Button(group_5, SWT.RADIO);
		raRadioBtn9.setEnabled(false);
		raRadioBtn9.setBounds(186, 170, 13, 16);

		Button raRadioBtn10 = new Button(group_5, SWT.RADIO);
		raRadioBtn10.setEnabled(false);
		raRadioBtn10.setBounds(200, 170, 13, 16);

		Button raRadioBtn11 = new Button(group_5, SWT.RADIO);
		raRadioBtn11.setEnabled(false);
		raRadioBtn11.setBounds(214, 170, 13, 16);

		Button raRadioBtn12 = new Button(group_5, SWT.RADIO);
		raRadioBtn12.setEnabled(false);
		raRadioBtn12.setBounds(228, 170, 13, 16);

		Label label_14 = new Label(group_5, SWT.NONE);
		label_14.setText("PC");
		label_14.setBounds(30, 131, 36, 15);

		Label label_15 = new Label(group_5, SWT.NONE);
		label_15.setText("RA");
		label_15.setBounds(30, 171, 36, 15);

		Label label_16 = new Label(group_5, SWT.NONE);
		label_16.setText("IR");
		label_16.setBounds(30, 211, 36, 15);

		irRadioBtn1 = new Button(group_5, SWT.RADIO);
		irRadioBtn1.setEnabled(false);
		irRadioBtn1.setBounds(70, 210, 13, 16);

		irRadioBtn2 = new Button(group_5, SWT.RADIO);
		irRadioBtn2.setEnabled(false);
		irRadioBtn2.setBounds(85, 210, 13, 16);

		irRadioBtn3 = new Button(group_5, SWT.RADIO);
		irRadioBtn3.setEnabled(false);
		irRadioBtn3.setBounds(100, 210, 13, 16);

		irRadioBtn4 = new Button(group_5, SWT.RADIO);
		irRadioBtn4.setEnabled(false);
		irRadioBtn4.setBounds(114, 210, 13, 16);

		irRadioBtn5 = new Button(group_5, SWT.RADIO);
		irRadioBtn5.setEnabled(false);
		irRadioBtn5.setBounds(128, 210, 13, 16);

		irRadioBtn6 = new Button(group_5, SWT.RADIO);
		irRadioBtn6.setEnabled(false);
		irRadioBtn6.setBounds(143, 210, 13, 16);

		irRadioBtn7 = new Button(group_5, SWT.RADIO);
		irRadioBtn7.setEnabled(false);
		irRadioBtn7.setBounds(158, 210, 13, 16);

		irRadioBtn8 = new Button(group_5, SWT.RADIO);
		irRadioBtn8.setEnabled(false);
		irRadioBtn8.setBounds(172, 210, 13, 16);

		irRadioBtn9 = new Button(group_5, SWT.RADIO);
		irRadioBtn9.setEnabled(false);
		irRadioBtn9.setBounds(186, 210, 13, 16);

		irRadioBtn10 = new Button(group_5, SWT.RADIO);
		irRadioBtn10.setEnabled(false);
		irRadioBtn10.setBounds(200, 210, 13, 16);

		irRadioBtn11 = new Button(group_5, SWT.RADIO);
		irRadioBtn11.setEnabled(false);
		irRadioBtn11.setBounds(214, 210, 13, 16);

		irRadioBtn12 = new Button(group_5, SWT.RADIO);
		irRadioBtn12.setEnabled(false);
		irRadioBtn12.setBounds(228, 210, 13, 16);

		irRadioBtn13 = new Button(group_5, SWT.RADIO);
		irRadioBtn13.setEnabled(false);
		irRadioBtn13.setBounds(243, 210, 13, 16);


		irRadioBtn14 = new Button(group_5, SWT.RADIO);
		irRadioBtn14.setEnabled(false);
		irRadioBtn14.setBounds(258, 210, 13, 16);

		irRadioBtn15 = new Button(group_5, SWT.RADIO);
		irRadioBtn15.setEnabled(false);
		irRadioBtn15.setBounds(272, 210, 13, 16);

		irRadioBtn16 = new Button(group_5, SWT.RADIO);
		irRadioBtn16.setEnabled(false);
		irRadioBtn16.setBounds(286, 210, 13, 16);

        irButtonArr.add(irRadioBtn1);
        irButtonArr.add(irRadioBtn2);
        irButtonArr.add(irRadioBtn3);
        irButtonArr.add(irRadioBtn4);
        irButtonArr.add(irRadioBtn5);
        irButtonArr.add(irRadioBtn6);
        irButtonArr.add(irRadioBtn7);
        irButtonArr.add(irRadioBtn8);
        irButtonArr.add(irRadioBtn9);
        irButtonArr.add(irRadioBtn10);
        irButtonArr.add(irRadioBtn11);
        irButtonArr.add(irRadioBtn12);
        irButtonArr.add(irRadioBtn13);
        irButtonArr.add(irRadioBtn14);
        irButtonArr.add(irRadioBtn15);
        irButtonArr.add(irRadioBtn16);

		irTxtBox = new Text(group_5, SWT.BORDER);
		irTxtBox.setBounds(70, 232, 153, 21);

		Label label_17 = new Label(group_5, SWT.NONE);
		label_17.setText("MAR");
		label_17.setBounds(30, 272, 36, 15);


		marRadioBtn1 = new Button(group_5, SWT.RADIO);
		marRadioBtn1.setEnabled(false);
		marRadioBtn1.setBounds(70, 271, 13, 16);

		marRadioBtn2 = new Button(group_5, SWT.RADIO);
		marRadioBtn2.setEnabled(false);
		marRadioBtn2.setBounds(85, 271, 13, 16);

		marRadioBtn3 = new Button(group_5, SWT.RADIO);
		marRadioBtn3.setEnabled(false);
		marRadioBtn3.setBounds(100, 271, 13, 16);


		marRadioBtn4 = new Button(group_5, SWT.RADIO);
		marRadioBtn4.setEnabled(false);
		marRadioBtn4.setBounds(114, 271, 13, 16);

		marRadioBtn5 = new Button(group_5, SWT.RADIO);
		marRadioBtn5.setEnabled(false);
		marRadioBtn5.setBounds(128, 271, 13, 16);


		marRadioBtn6 = new Button(group_5, SWT.RADIO);
		marRadioBtn6.setEnabled(false);
		marRadioBtn6.setBounds(143, 271, 13, 16);


		marRadioBtn7 = new Button(group_5, SWT.RADIO);
		marRadioBtn7.setEnabled(false);
		marRadioBtn7.setBounds(158, 271, 13, 16);


		marRadioBtn8 = new Button(group_5, SWT.RADIO);
		marRadioBtn8.setEnabled(false);
		marRadioBtn8.setBounds(172, 271, 13, 16);


		marRadioBtn9 = new Button(group_5, SWT.RADIO);
		marRadioBtn9.setEnabled(false);
		marRadioBtn9.setBounds(186, 271, 13, 16);


		marRadioBtn10 = new Button(group_5, SWT.RADIO);
		marRadioBtn10.setEnabled(false);
		marRadioBtn10.setBounds(200, 271, 13, 16);


		marRadioBtn11 = new Button(group_5, SWT.RADIO);
		marRadioBtn11.setEnabled(false);
		marRadioBtn11.setBounds(214, 271, 13, 16);


		marRadioBtn12 = new Button(group_5, SWT.RADIO);
		marRadioBtn12.setEnabled(false);
		marRadioBtn12.setBounds(228, 271, 13, 16);

		marRadioBtn13 = new Button(group_5, SWT.RADIO);
		marRadioBtn13.setEnabled(false);
		marRadioBtn13.setBounds(243, 271, 13, 16);


		marRadioBtn14 = new Button(group_5, SWT.RADIO);
		marRadioBtn14.setEnabled(false);
		marRadioBtn14.setBounds(258, 271, 13, 16);


		marRadioBtn15 = new Button(group_5, SWT.RADIO);
		marRadioBtn15.setEnabled(false);
		marRadioBtn15.setBounds(272, 271, 13, 16);

		marRadioBtn16 = new Button(group_5, SWT.RADIO);
		marRadioBtn16.setEnabled(false);
		marRadioBtn16.setBounds(286, 271, 13, 16);

        marButtonArr.add(marRadioBtn1);
        marButtonArr.add(marRadioBtn2);
        marButtonArr.add(marRadioBtn3);
        marButtonArr.add(marRadioBtn4);
        marButtonArr.add(marRadioBtn5);
        marButtonArr.add(marRadioBtn6);
        marButtonArr.add(marRadioBtn7);
        marButtonArr.add(marRadioBtn8);
        marButtonArr.add(marRadioBtn9);
        marButtonArr.add(marRadioBtn10);
        marButtonArr.add(marRadioBtn11);
        marButtonArr.add(marRadioBtn12);
        marButtonArr.add(marRadioBtn13);
        marButtonArr.add(marRadioBtn14);
        marButtonArr.add(marRadioBtn15);
        marButtonArr.add(marRadioBtn16);

		marTxtBox = new Text(group_5, SWT.BORDER);
		marTxtBox.setBounds(70, 294, 153, 21);

		Label label_18 = new Label(group_5, SWT.NONE);
		label_18.setText("MBR");
		label_18.setBounds(30, 331, 36, 15);

		mbrRadioBtn1 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn1.setEnabled(false);
		mbrRadioBtn1.setBounds(70, 330, 13, 16);

		mbrRadioBtn2 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn2.setEnabled(false);
		mbrRadioBtn2.setBounds(85, 330, 13, 16);

		mbrRadioBtn3 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn3.setEnabled(false);
		mbrRadioBtn3.setBounds(100, 330, 13, 16);

		mbrRadioBtn4 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn4.setEnabled(false);
		mbrRadioBtn4.setBounds(114, 330, 13, 16);

		mbrRadioBtn5 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn5.setEnabled(false);
		mbrRadioBtn5.setBounds(128, 330, 13, 16);

		mbrRadioBtn6 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn6.setEnabled(false);
		mbrRadioBtn6.setBounds(143, 330, 13, 16);

		mbrRadioBtn7 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn7.setEnabled(false);
		mbrRadioBtn7.setBounds(158, 330, 13, 16);

		mbrRadioBtn8 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn8.setEnabled(false);
		mbrRadioBtn8.setBounds(172, 330, 13, 16);

		mbrRadioBtn9 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn9.setEnabled(false);
		mbrRadioBtn9.setBounds(186, 330, 13, 16);

		mbrRadioBtn10 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn10.setEnabled(false);
		mbrRadioBtn10.setBounds(200, 330, 13, 16);


		mbrRadioBtn11 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn11.setEnabled(false);
		mbrRadioBtn11.setBounds(214, 330, 13, 16);


		mbrRadioBtn12 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn12.setEnabled(false);
		mbrRadioBtn12.setBounds(228, 330, 13, 16);


		mbrRadioBtn13 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn13.setEnabled(false);
		mbrRadioBtn13.setBounds(243, 330, 13, 16);

		mbrRadioBtn14 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn14.setEnabled(false);
		mbrRadioBtn14.setBounds(258, 330, 13, 16);

		mbrRadioBtn15 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn15.setEnabled(false);
		mbrRadioBtn15.setBounds(272, 330, 13, 16);

		mbrRadioBtn16 = new Button(group_5, SWT.RADIO);
		mbrRadioBtn16.setEnabled(false);
		mbrRadioBtn16.setBounds(286, 330, 13, 16);

        mbrButtonArr.add(mbrRadioBtn1);
        mbrButtonArr.add(mbrRadioBtn2);
        mbrButtonArr.add(mbrRadioBtn3);
        mbrButtonArr.add(mbrRadioBtn4);
        mbrButtonArr.add(mbrRadioBtn5);
        mbrButtonArr.add(mbrRadioBtn6);
        mbrButtonArr.add(mbrRadioBtn7);
        mbrButtonArr.add(mbrRadioBtn8);
        mbrButtonArr.add(mbrRadioBtn9);
        mbrButtonArr.add(mbrRadioBtn10);
        mbrButtonArr.add(mbrRadioBtn11);
        mbrButtonArr.add(mbrRadioBtn12);
        mbrButtonArr.add(mbrRadioBtn13);
        mbrButtonArr.add(mbrRadioBtn14);
        mbrButtonArr.add(mbrRadioBtn15);
        mbrButtonArr.add(mbrRadioBtn16);

        iRegTextArray.add(x1TxtBox);
        iRegTextArray.add(x2TxtBox);
        iRegTextArray.add(x3TxtBox);

		mbrTxtBox = new Text(group_5, SWT.BORDER);
		mbrTxtBox.setBounds(70, 353, 153, 21);

		Label label_19 = new Label(group_5, SWT.NONE);
		label_19.setText("MSR");
		label_19.setBounds(30, 392, 36, 15);

		Button msrRadioBtn1 = new Button(group_5, SWT.RADIO);
		msrRadioBtn1.setEnabled(false);
		msrRadioBtn1.setBounds(70, 391, 13, 16);

		Button msrRadioBtn2 = new Button(group_5, SWT.RADIO);
		msrRadioBtn2.setEnabled(false);
		msrRadioBtn2.setBounds(85, 391, 13, 16);

		Button msrRadioBtn3 = new Button(group_5, SWT.RADIO);
		msrRadioBtn3.setEnabled(false);
		msrRadioBtn3.setBounds(100, 391, 13, 16);

		Button msrRadioBtn4 = new Button(group_5, SWT.RADIO);
		msrRadioBtn4.setEnabled(false);
		msrRadioBtn4.setBounds(114, 391, 13, 16);

		Button msrRadioBtn5 = new Button(group_5, SWT.RADIO);
		msrRadioBtn5.setEnabled(false);
		msrRadioBtn5.setBounds(128, 391, 13, 16);

		Button msrRadioBtn6 = new Button(group_5, SWT.RADIO);
		msrRadioBtn6.setEnabled(false);
		msrRadioBtn6.setBounds(143, 391, 13, 16);

		Button msrRadioBtn7 = new Button(group_5, SWT.RADIO);
		msrRadioBtn7.setEnabled(false);
		msrRadioBtn7.setBounds(158, 391, 13, 16);

		Button msrRadioBtn8 = new Button(group_5, SWT.RADIO);
		msrRadioBtn8.setEnabled(false);
		msrRadioBtn8.setBounds(172, 391, 13, 16);

		Button msrRadioBtn9 = new Button(group_5, SWT.RADIO);
		msrRadioBtn9.setEnabled(false);
		msrRadioBtn9.setBounds(186, 391, 13, 16);

		Button msrRadioBtn10 = new Button(group_5, SWT.RADIO);
		msrRadioBtn10.setEnabled(false);
		msrRadioBtn10.setBounds(200, 391, 13, 16);

		Button msrRadioBtn11 = new Button(group_5, SWT.RADIO);
		msrRadioBtn11.setEnabled(false);
		msrRadioBtn11.setBounds(214, 391, 13, 16);

		Button msrRadioBtn12 = new Button(group_5, SWT.RADIO);
		msrRadioBtn12.setEnabled(false);
		msrRadioBtn12.setBounds(228, 391, 13, 16);

		Button msrRadioBtn13 = new Button(group_5, SWT.RADIO);
		msrRadioBtn13.setEnabled(false);
		msrRadioBtn13.setBounds(243, 391, 13, 16);

		Button msrRadioBtn14 = new Button(group_5, SWT.RADIO);
		msrRadioBtn14.setEnabled(false);
		msrRadioBtn14.setBounds(258, 391, 13, 16);

		Button msrRadioBtn15 = new Button(group_5, SWT.RADIO);
		msrRadioBtn15.setEnabled(false);
		msrRadioBtn15.setBounds(272, 391, 13, 16);

		Button msrRadioBtn16 = new Button(group_5, SWT.RADIO);
		msrRadioBtn16.setEnabled(false);
		msrRadioBtn16.setBounds(286, 391, 13, 16);

		ccTxtBox = new Text(group_5, SWT.BORDER);
		ccTxtBox.setBounds(258, 43, 130, 21);

		mfrTxtBox = new Text(group_5, SWT.BORDER);
		mfrTxtBox.setBounds(258, 84, 130, 21);

		pcTxtBox = new Text(group_5, SWT.BORDER);
		pcTxtBox.setBounds(258, 125, 130, 21);

		raTxtBox = new Text(group_5, SWT.BORDER);
		raTxtBox.setBounds(258, 165, 130, 21);

		Label label_20 = new Label(group_5, SWT.NONE);
		label_20.setText("Internal Registers");
		//label_20.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.BOLD));
		label_20.setBounds(45, 474, 127, 25);

		Label label_21 = new Label(group_5, SWT.NONE);
		label_21.setText("IAR");
		label_21.setBounds(85, 517, 55, 15);

		Label label_22 = new Label(group_5, SWT.NONE);
		label_22.setText("IRR");
		label_22.setBounds(257, 517, 55, 15);

		iarTxtBox = new Text(group_5, SWT.BORDER);
		iarTxtBox.setBounds(70, 538, 76, 21);

		irrTxtBox = new Text(group_5, SWT.BORDER);
		irrTxtBox.setBounds(243, 538, 76, 21);

		msrTxtBox = new Text(group_5, SWT.BORDER);
		msrTxtBox.setBounds(70, 413, 153, 21);

		Label lblSimulator = new Label(shell, SWT.NONE);
		lblSimulator.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		//lblSimulator.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		//	lblSimulator.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		//	lblSimulator.setFont(SWTResourceManager.getFont("Times New Roman", 20, SWT.BOLD | SWT.ITALIC));
		lblSimulator.setBounds(631, 30, 124, 32);
		lblSimulator.setText("ArchSim12");


		listener = new Listener() {

			public void handleEvent(Event event) {
				if (event.widget == iplBtn) {
					archSetup.init();
					statusTxtBox.setText("IPL clicked, system initialized. Instructions loaded into memory and PC set");
					pcTxtBox.setText(archSetup.PC.getValue());

					System.out.println("PC value in binary: " + Integer.toBinaryString(0x10000 | Integer.parseInt(archSetup.PC.getValue())).substring(1));

					//pcRadioBtn2.setSelection(true);

					setRadioBtn((Integer.toBinaryString(0x10000 |Integer.parseInt(archSetup.PC.getValue())).substring(1)).substring(4, 16), pcRadioButtonArray);

					iplBtn.setEnabled(false);
					singleStepBtn.setEnabled(true);
					standardBtn.setEnabled(true);

				}
				else if(event.widget == singleStepBtn)
				{
					if(counter==10)
					{

						counter=0;
					}
					System.out.println("Singel Step clicked");
					archSetup.singleStep(counter);
					counter++;
					System.out.println("Counter: " +counter);
				}

				else if(event.widget == standardBtn)
				{
					for (int i = 1; i < 11; i++) {

						if(i==10)
						{
							if(archSetup.stop)
							{
								iplBtn.setEnabled(false);
								singleStepBtn.setEnabled(false);
								standardBtn.setEnabled(false);
								ldrChkBox.setSelection(true);
								ldaChkBox.setSelection(true);
								ldxChkBox.setSelection(true);
								strChkBox.setSelection(true);
								stxChkBox.setSelection(true);
								break;
							}
							i=1;
						}
						archSetup.singleStep(i);
					}
				}
				else if(event.widget == haltBtn)
				{
					iplBtn.setEnabled(false);
					singleStepBtn.setEnabled(false);
					standardBtn.setEnabled(false);
					statusTxtBox.setText("Program Halted!");
				}

                else if(event.widget == fetchBtn)
                {

                    if(archSetup.flag==0)
                    {
                        mainNumber=fetchInstructions(statusTxtBox).split(":");
                    }
                    else if(archSetup.flag==1)
                    {
                        searchNumber= fetchInstructions(statusTxtBox).split(":");
                    }

//
                }
			}

		};

		iplBtn.addListener(SWT.Selection,listener);
		singleStepBtn.addListener(SWT.Selection,listener);
		standardBtn.addListener(SWT.Selection,listener);
		haltBtn.addListener(SWT.Selection,listener);

	}

	// Method that color the different radio buttons and their binary representation for Registers of 4 bits
//	public void setRadioBtn4(String binary, Button b1, Button b2, Button b3, Button b4){
//		if(binary.substring(0,1).equals("1")) b1.setSelection(true);
//		else b1.setSelection(false);
//		if(binary.substring(1,2).equals("1")) b2.setSelection(true);
//		else b2.setSelection(false);
//		if(binary.substring(2,3).equals("1")) b3.setSelection(true);
//		else b3.setSelection(false);
//		if(binary.substring(3,4).equals("1")) b4.setSelection(true);
//		else b1.setSelection(false);
//
//		//	checkEnable(b1);
//		//	checkEnable(b2);
//		//	checkEnable(b3);
//		//	checkEnable(b4);
//	}

	// Method that color the different radio buttons and their binary representation for Registers of 12 bits
//	public void setRadioBtn12(String binary, Button b1, Button b2, Button b3, Button b4,
//							  Button b5, Button b6, Button b7, Button b8, Button b9, Button b10,
//							  Button b11, Button b12){
//
//
//		if(binary.substring(0,1).equals("1")) b1.setSelection(true);
//		else b1.setSelection(false);
//		if(binary.substring(1,2).equals("1")) b2.setSelection(true);
//		else b2.setSelection(false);
//		if(binary.substring(2,3).equals("1")) b3.setSelection(true);
//		else b3.setSelection(false);
//		if(binary.substring(3,4).equals("1")) b4.setSelection(true);
//		else b1.setSelection(false);
//		if(binary.substring(4,5).equals("1")) b5.setSelection(true);
//		else b5.setSelection(false);
//		if(binary.substring(5,6).equals("1")) b6.setSelection(true);
//		else b6.setSelection(false);
//		if(binary.substring(6,7).equals("1")) b7.setSelection(true);
//		else b7.setSelection(false);
//		if(binary.substring(7,8).equals("1")) b8.setSelection(true);
//		else b8.setSelection(false);
//		if(binary.substring(8,9).equals("1")) b9.setSelection(true);
//		else b9.setSelection(false);
//		if(binary.substring(9,10).equals("1")) b10.setSelection(true);
//		else b10.setSelection(false);
//		if(binary.substring(10,11).equals("1")) b11.setSelection(true);
//		else b11.setSelection(false);
//		if(binary.substring(11,12).equals("1")) b12.setSelection(true);
//		else b12.setSelection(false);
//
//		//	checkEnable(b1);
//		//	checkEnable(b2);
//		//	checkEnable(b3);
//		//	checkEnable(b4);
//		//	checkEnable(b5);
//		//	checkEnable(b6);
//		//	checkEnable(b7);
//		//	checkEnable(b8);
//		//	checkEnable(b9);
//		//	checkEnable(b10);
//		//	checkEnable(b11);
//		//	checkEnable(b12);
//
//	}

	// Method that color the different radio buttons and their binary representation for Registers of 16 bits
	public void setRadioBtn(String binary, List<Button> buttonList){

		System.out.println("In radio button method, binary value:" + binary);

        for (int i = 0; i < buttonList.size(); i++) {
            if(binary.substring(i,i+1).equals("1")) buttonList.get(i).setSelection(true);
            else buttonList.get(i).setSelection(false);
        }

//		if(binary.substring(1,2).equals("1")) b2.setSelection(true);
//		else b2.setSelection(false);
//		if(binary.substring(2,3).equals("1")) b3.setSelection(true);
//		else b3.setSelection(false);
//		if(binary.substring(3,4).equals("1")) b4.setSelection(true);
//		else b1.setSelection(false);
//		if(binary.substring(4,5).equals("1")) b5.setSelection(true);
//		else b5.setSelection(false);
//		if(binary.substring(5,6).equals("1")) b6.setSelection(true);
//		else b6.setSelection(false);
//		if(binary.substring(6,7).equals("1")) b7.setSelection(true);
//		else b7.setSelection(false);
//		if(binary.substring(7,8).equals("1")) b8.setSelection(true);
//		else b8.setSelection(false);
//		if(binary.substring(8,9).equals("1")) b9.setSelection(true);
//		else b9.setSelection(false);
//		if(binary.substring(9,10).equals("1")) b10.setSelection(true);
//		else b10.setSelection(false);
//		if(binary.substring(10,11).equals("1")) b11.setSelection(true);
//		else b11.setSelection(false);
//		if(binary.substring(11,12).equals("1")) b12.setSelection(true);
//		else b12.setSelection(false);
//		if(binary.substring(12,13).equals("1")) b13.setSelection(true);
//		else b13.setSelection(false);
//		if(binary.substring(13,14).equals("1")) b14.setSelection(true);
//		else b14.setSelection(false);
//		if(binary.substring(14,15).equals("1")) b15.setSelection(true);
//		else b15.setSelection(false);
//		if(binary.substring(15,16).equals("1")) b16.setSelection(true);
//		else b16.setSelection(false);

		//	checkEnable(b1);
		//	checkEnable(b2);
		//	checkEnable(b3);
		//	checkEnable(b4);
		//	checkEnable(b5);
		//	checkEnable(b6);
		//	checkEnable(b7);
		//	checkEnable(b8);
		//	checkEnable(b9);
		//	checkEnable(b10);
		//	checkEnable(b11);
		//	checkEnable(b12);
		//	checkEnable(b13);
		//	checkEnable(b14);
		//	checkEnable(b15);
		//	checkEnable(b16);
	}

	void checkEnable(Button button)
	{
		if(!button.isEnabled())
		{
			button.setEnabled(true);
		}
	}

	String fetchInstructions(Text txtbox)
	{
		String result= "";

		result= txtbox.getText();
		return result;
	}
}