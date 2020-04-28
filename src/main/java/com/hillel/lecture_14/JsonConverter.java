package com.hillel.lecture_14;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {
    private static final String ID = "\"id\"";
    private static final String FIRST_NAME = "\"firstName\"";
    private static final String LAST_NAME = "lastName";
    private static final String AGE = "age";
    private static final String GENDER = "gender";
    private static final String COMPANY = "company";
    private static final String EMAIL = "email";
    private static final String PHONE = "phone";
    private static final String ADRESS =  "address";
    private static final String FRIENDS =  "friends";
    private static final String CITY = "city";
    private static final String STREET = "street";


    public String convertToJsonString(List<User> users) {
        System.out.println("users " + users.get(1).toString()  );


//        TODO implements result
        String result = "";

        return result;
    }

    public String convertToJsonString(User users) {
        Friend friend = new Friend();
        HashMap formData = new HashMap();
        formData.put(ID, users.getId());
        formData.put(FIRST_NAME, users.getFirstName());
        formData.put(LAST_NAME, users.getLastName());
        formData.put(AGE, users.getAge());
        formData.put(GENDER, users.getGender());
        formData.put(COMPANY, users.getCompany());
        formData.put(GENDER, users.getGender());
        formData.put(EMAIL, users.getEmail());
        formData.put(PHONE, users.getPhone());
        formData.put(ADRESS, CITY + "{" + "\"" + users.getAddress().getCity() + "\"");
        formData.put(FRIENDS, users.getFriends().toString());

        System.out.println("friend " + users.getFriends().toString());
                System.out.println("tst " + formData.toString().replace('=', ':'));

//        TODO implements result
        String result = "";

        return result;
    }


}
