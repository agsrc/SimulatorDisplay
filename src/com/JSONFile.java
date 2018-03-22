package com;

import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class JSONFile {

    String instructions[];
    public JSONFile() {

        JSONParser  jsonParser = new JSONParser();
        instructions = new String[20];
        try {
           JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("res/instructions1.json"));
           Logger.getLogger(jsonObject.toString());

           JSONObject instructionSet = (JSONObject) jsonObject.get("instructionSet");

            System.out.println(instructionSet.size());

            for (int i = 0; i < instructionSet.size(); i++) {

                instructions[i]= (String) instructionSet.get("instruction " +i);
                System.out.println(instructions[i]);
            }

        } catch (IOException e) {

            Logger.getLogger("IO Exception");
            e.printStackTrace();
        } catch (ParseException e) {
            Logger.getLogger("Parse Exception Exception");
            e.printStackTrace();
        }

    }
}
