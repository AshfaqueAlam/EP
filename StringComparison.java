class StringComparison {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "A";
        String s3 = "A";
        String s4 = new String("A");    // Object of type String class.

        // Compare s1 & s2. Should return `true` as both refers to same object in memory.
        System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));

        // Compare s1 & s3. Should return `true` as both refers to same object in memory.
        System.out.println(s1 + " == " + s3 + ": " + (s2 == s3));

        // Compare s1 & s4. Should return `false` as both refers to different object in memory.
        System.out.println(s1 + " == " + s4 + ": " + (s1 == s4));
    }
}
