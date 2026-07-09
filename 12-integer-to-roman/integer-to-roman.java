class Solution {
    //Worst but very first approach come into my mind
    public String subtractive_Form(int val){
        switch (val) {

        // Ones
        case 1: return "I";
        case 2: return "II";
        case 3: return "III";
        case 4: return "IV";
        case 5: return "V";
        case 6: return "VI";
        case 7: return "VII";
        case 8: return "VIII";
        case 9: return "IX";

        // Tens
        case 10: return "X";
        case 20: return "XX";
        case 30: return "XXX";
        case 40: return "XL";
        case 50: return "L";
        case 60: return "LX";
        case 70: return "LXX";
        case 80: return "LXXX";
        case 90: return "XC";

        // Hundreds
        case 100: return "C";
        case 200: return "CC";
        case 300: return "CCC";
        case 400: return "CD";
        case 500: return "D";
        case 600: return "DC";
        case 700: return "DCC";
        case 800: return "DCCC";
        case 900: return "CM";

        // Thousands
        case 1000: return "M";
        case 2000: return "MM";
        case 3000: return "MMM";
    }
    return "";
    }
    public String intToRoman(int num) {
        String ans = "";
        int divisior = 0;
        int digit = 0;
        int value = 0;
        if(num>999){
            divisior = 1000;
        }else if(num>99){
            divisior = 100;
        }else if(num>9){
            divisior = 10;
        }else divisior = 1;
        while(num>0){
            digit = num/divisior;
            value = digit * divisior;
            ans += subtractive_Form(value);

            num %= divisior;
            divisior /= 10; 
        }
        return ans;
    }
}