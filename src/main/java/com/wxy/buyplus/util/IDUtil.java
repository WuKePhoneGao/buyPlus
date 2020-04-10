package com.wxy.buyplus.util;

import java.util.UUID;

public class IDUtil {
    public static String getID(){
        UUID uuid=UUID.randomUUID();
        String uuidStr=uuid.toString();
        return uuidStr;
    }
}
