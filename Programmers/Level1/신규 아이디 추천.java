class Solution {
    public String solution(String new_id) {
        
        String firstStep = toLowerCase(new_id);
        String SecondStep = removeStr(firstStep);
        String thirdFourthStep = removeColon(SecondStep);
        
        if(thirdFourthStep.length() == 0) {
			thirdFourthStep += "a";
		}

		if(thirdFourthStep.length() >= 16) {
			thirdFourthStep = thirdFourthStep.substring(0, 15);
		}
        
		if(thirdFourthStep.endsWith(".")) {
			thirdFourthStep = thirdFourthStep.substring(0, thirdFourthStep.length()-1);
		}

		String last = thirdFourthStep.charAt(thirdFourthStep.length()-1) + "";
		if(thirdFourthStep.length() == 2) {
			thirdFourthStep = thirdFourthStep + last;
		} else if(thirdFourthStep.length() == 1) {
			thirdFourthStep = thirdFourthStep + last + last;
		}
        
        
        return thirdFourthStep;
    }
    
    String toLowerCase(String id) {
        char[] charArr = id.toCharArray();
        String res = "";
        for (int i=0;i<charArr.length;i++) {
            if (charArr[i] >= 'A' && charArr[i]<='Z') {
                res += String.valueOf((char)(charArr[i]+' '));
            }
            else {
                res += String.valueOf(charArr[i]);
            }
        }
        return res;
    }
    
    String removeStr(String id) {
        String res = "";
        for (int i=0;i<id.length();i++) {
            char ch = id.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ||
               ch == '-' || ch == '_' || ch == '.') {
                res += String.valueOf(ch);
            }
        }
        return res;
    }
    
    String removeColon(String id) {
        String res = "";
        boolean flag = false;
        for (int i=0;i<id.length();i++) {
            char ch = id.charAt(i);
            if (ch == '.' && flag) {
                continue;   
            }
            else if (ch == '.') {
                flag = true;
                res += String.valueOf(ch);
            }
            else {
                flag = false;
                res += String.valueOf(ch);
            }
        }
        
        if(res.startsWith(".") ) {
			res = res.substring(1, res.length());
		} else if(res.endsWith(".")) {
			res = res.substring(0, res.length()-1);
		}
        return res;
    }
}