package onboarding.java;

public interface IStringUtil {

    /**
     * find the last postion of sub-string
     * 
     * @param parentStr
     * @param subStr
     * @return postion of string
     */
    int findSubString(String parentStr, String subStr);

    /**
     * Find postion with case-sensitive flag
     * 
     * @param parentStr
     * @param subStr
     * @param isSensitive
     * @return vi tri cua subStr trong parent
     */
    int findSubString(String parentStr, String subStr, boolean isSensitive);

    /**
     * remove a character from parent string.
     * 
     * @param parentStr
     * @param index
     *            }
     * @return a newString after remove oldString in index
     */
    String removeCharAt(String parentStr, int index);

    /**
     * Remove a character
     * 
     * @param parentStr
     * @param removeChar
     * @return a newString after remove oldString with character
     */
    String removeChar(String parentStr, char removeChar);

    /**
     * Transform one string into upper case.
     * 
     * @param originalStr
     * @return a string upper
     */
    String upper(String originalStr);

    /**
     * Transform one string into Lower case
     * 
     * @param originalStr
     * @return a string Lower
     */
    String lower(String originalStr);

    /**
     * Transform one string into upper case or lower case
     * 
     * @param originalStr
     * @param targetCase
     * @return a string transform upper->Lower if "LO", lower->upper if "UP
     */
    String transform(String originalStr, String targetCase);

    /**
     * Reverse a String
     * 
     * @param originalStr
     * @return a String is reversed
     */
    String reverse(String originalStr);

    /**
     * Split the parent string into sub-string by delimeter
     * 
     * @param originalStr
     * @param delimeter
     * @return a String[] after split
     */
    String[] split(String originalStr, char delimeter);

}