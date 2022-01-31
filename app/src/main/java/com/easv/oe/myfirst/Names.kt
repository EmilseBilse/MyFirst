package com.easv.oe.myfirst

class Names {
    val boyNames = arrayOf("Liam", "Noah", "Oliver", "Elijah")
    val girlNames = arrayOf("Olivia", "Emma", "Ava", "Charlotte")

    public fun checkGirlName(name: String): Boolean{
        for (girlName in girlNames) {
            if(girlName.toLowerCase() == name)
                return true;
        }
        return false
    }

    public fun checkBoyName(name: String): Boolean{
        for (boyName in boyNames) {
            if(boyName.toLowerCase() == name)
                return true;
        }
        return false
    }

    public fun checkForName(name: String): String{
        if (checkBoyName(name))
            return "Boy";

        if(checkGirlName(name))
            return "Girl";

        return "None";
    }

}