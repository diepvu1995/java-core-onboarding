package onboarding.java;

public class StringUtil implements IStringUtil {
    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#findSubString(java.lang.String, java.lang.String)
     */
    @Override
    public int findSubString(String parentStr, String subStr) {
        return parentStr.lastIndexOf(subStr);
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#findSubString(java.lang.String, java.lang.String, boolean)
     */
    @Override
    public int findSubString(String parentStr, String subStr, boolean isSensitive) {
        return isSensitive ? parentStr.lastIndexOf(subStr) : parentStr.toLowerCase().lastIndexOf(subStr.toLowerCase());
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#removeCharAt(java.lang.String, int)
     */
    @Override
    public String removeCharAt(String parentStr, int index) {
        return new StringBuilder(parentStr).deleteCharAt(index).toString();
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#removeChar(java.lang.String, char)
     */
    @Override
    public String removeChar(String parentStr, char removeChar) {
        return parentStr.replaceAll(parentStr, String.valueOf(removeChar));
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#upper(java.lang.String)
     */
    @Override
    public String upper(String originalStr) {
        return originalStr.toUpperCase();
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#lower(java.lang.String)
     */
    @Override
    public String lower(String originalStr) {
        return originalStr.toLowerCase();
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#transform(java.lang.String, java.lang.String)
     */
    @Override
    public String transform(String originalStr, String targetCase) {
        return targetCase.equals("UP") ? originalStr.toUpperCase() : originalStr.toLowerCase();
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#reverse(java.lang.String)
     */
    @Override
    public String reverse(String originalStr) {
        return (new StringBuffer(originalStr)).reverse().toString();
    }

    /* (non-Javadoc)
     * @see onboarding.java.IStringUtil#split(java.lang.String, char)
     */
    @Override
    public String[] split(String originalStr, char delimeter) {
        return originalStr.split(String.valueOf(delimeter));
    }
}
