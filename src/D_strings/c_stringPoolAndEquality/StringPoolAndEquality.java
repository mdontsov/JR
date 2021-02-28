package D_strings.c_stringPoolAndEquality;

public class StringPoolAndEquality {

    public static void main(String[] args) {
        String name = "John"; // new String, new pool, new hash
        String anotherName = "John"; // same String, same pool, same hash
        String john = "Jo" + "hn"; // same String, same pool, same hash
        String newName = new String("John"); // NEW String, new pool, new hash

        System.out.println("name == anotherName: " + (name == anotherName)); // same reference
        System.out.println("name == john: " + (name == john)); // same reference
        System.out.println("name == newName: " + (name == newName)); // NEW reference

        System.out.println("name equals anotherName: " + (name.equals(anotherName))); // same value
        System.out.println("name equals john: " + (name.equals(john))); // same value
        System.out.println("name equals newName: " + (name.equals(newName))); // same value

        System.out.println("name hash: " + System.identityHashCode(name));
        System.out.println("anotherName hash: " + System.identityHashCode(anotherName));
        System.out.println("john hash: " + System.identityHashCode(john));
        System.out.println("newName hash: " + System.identityHashCode(newName));

        String str1 = "abc"; // new String, new pool, new hash
        String str2 = "ah"; // same String, same pool, new hash
        String str3 = str2 + "c"; // str2 is reassigned/reused here > new String object

        System.out.println("str1 == str2: " + (str1 == str2)); // 2 different strings > false
        System.out.println("str2 == str3: " + (str2 == str3)); // 2 different strings > false
        System.out.println("str3 == str1: " + (str3 == str1)); // false
        System.out.println("str1 hash: " + System.identityHashCode(str1));
        System.out.println("str2 hash: " + System.identityHashCode(str2));
        System.out.println("str3 hash: " + System.identityHashCode(str3));
    }
}
