public class ExampleVariable07 {
    public static void main(String[] args) {
        String hobby = "Badminton";
        boolean isSmart = true;
        char gender = 'F';
        byte _age = 17;
        double $gpa = 3.38, height = 1.60;

        System.out.println(hobby);
        System.out.println("Are you smart ? " + isSmart);
        System.out.println("Gender : " + gender);
        System.out.println("My current age is : " + _age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height));
    }
}
