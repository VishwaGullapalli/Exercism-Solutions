public class Say {

    public String say(long number) {
        if (number < 0 || number > 999999999999L) {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999");
        }
        
        if (number == 0) {
            return "zero";
        }
        
        String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };
        
        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        
        String[] thousands = {
            "", "thousand", "million", "billion"
        };
        
        StringBuilder result = new StringBuilder();
        int groupIndex = 0;
        
        while (number > 0) {
            int group = (int)(number % 1000);
            if (group != 0) {
                String groupText = convertGroup(group, units, tens);
                if (groupIndex > 0) {
                    groupText += " " + thousands[groupIndex];
                }
                
                if (result.length() > 0) {
                    result.insert(0, groupText + " ");
                } else {
                    result.insert(0, groupText);
                }
            }
            number /= 1000;
            groupIndex++;
        }
        
        return result.toString();
    }
    
    private String convertGroup(int number, String[] units, String[] tens) {
        StringBuilder result = new StringBuilder();
        
        int hundreds = number / 100;
        if (hundreds > 0) {
            result.append(units[hundreds]).append(" hundred");
        }
        
        int remainder = number % 100;
        if (remainder >= 20) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(tens[remainder / 10]);
            if (remainder % 10 > 0) {
                result.append("-").append(units[remainder % 10]);
            }
        } else if (remainder > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(units[remainder]);
        }
        
        return result.toString();
    }
}

// Referred ideas from StackOverflow