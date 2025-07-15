// Last updated: 7/15/2025, 10:21:36 AM
class Solution {
    public boolean isValid(String word) {
    if (word.length() <= 2) {
        return false;
    }

    // Check for at least one non-alphanumeric character
    if (word.matches(".*[^a-zA-Z0-9].*")) {
        return false;
    }

    // Check if string contains at least one vowel
    boolean cond3 = word.matches(".*[aeiouAEIOU].*");

    // Check if string contains at least one non-vowel character
    boolean cond4 = word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*");

    return cond3 && cond4;
}

        
}