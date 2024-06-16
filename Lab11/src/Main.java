import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void Task1() {}

    private static void Task2() {}

    private static void Task3() {
        String testString1 = "Hello123";
        String testString2 = "Hello_123";
        String testString3 = "Hello!";

        String regex = "^[a-zA-Z0-9]+$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
    }

    private static void Task4() {
        String testString1 = "a";
        String testString2 = "ab";
        String testString3 = "abb";
        String testString4 = "bba";
        String testString5 = "ba";
        String testString6 = "aabb";

        String regex = "^ab*$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);
        boolean result4 = testString4.matches(regex);
        boolean result5 = testString5.matches(regex);
        boolean result6 = testString6.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
        System.out.println(testString4 + " -> " + result4);
        System.out.println(testString5 + " -> " + result5);
        System.out.println(testString6 + " -> " + result6);
    }

    private static void Task5() {
        String testString1 = "ab";
        String testString2 = "abb";
        String testString3 = "a";
        String testString4 = "bba";
        String testString5 = "ba";
        String testString6 = "aabb";

        String regex = "^ab+$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);
        boolean result4 = testString4.matches(regex);
        boolean result5 = testString5.matches(regex);
        boolean result6 = testString6.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
        System.out.println(testString4 + " -> " + result4);
        System.out.println(testString5 + " -> " + result5);
        System.out.println(testString6 + " -> " + result6);
    }

    private static void Task6() {
        String testString1 = "abbb";
        String testString2 = "abb";
        String testString3 = "a";
        String testString4 = "abbbb";
        String testString5 = "ba";
        String testString6 = "aabbb";

        String regex = "^ab{3}$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);
        boolean result4 = testString4.matches(regex);
        boolean result5 = testString5.matches(regex);
        boolean result6 = testString6.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
        System.out.println(testString4 + " -> " + result4);
        System.out.println(testString5 + " -> " + result5);
        System.out.println(testString6 + " -> " + result6);
    }

    private static void Task7() {
        String testString1 = "abb";
        String testString2 = "abbb";
        String testString3 = "ab";
        String testString4 = "abbbb";
        String testString5 = "ba";
        String testString6 = "aabb";

        String regex = "^ab{2,3}$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);
        boolean result4 = testString4.matches(regex);
        boolean result5 = testString5.matches(regex);
        boolean result6 = testString6.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
        System.out.println(testString4 + " -> " + result4);
        System.out.println(testString5 + " -> " + result5);
        System.out.println(testString6 + " -> " + result6);
    }

    private static void Task8() {
        String input = "example_test another_example notMatching_123 test_example_test";
        String regex = "\\b[a-z]+_[a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void Task9() {
        String testString1 = "ab";
        String testString2 = "a_test_b";
        String testString3 = "abc";
        String testString4 = "a123b";
        String testString5 = "ba";
        String testString6 = "a__b";

        String regex = "^a.*b$";

        boolean result1 = testString1.matches(regex);
        boolean result2 = testString2.matches(regex);
        boolean result3 = testString3.matches(regex);
        boolean result4 = testString4.matches(regex);
        boolean result5 = testString5.matches(regex);
        boolean result6 = testString6.matches(regex);

        System.out.println(testString1 + " -> " + result1);
        System.out.println(testString2 + " -> " + result2);
        System.out.println(testString3 + " -> " + result3);
        System.out.println(testString4 + " -> " + result4);
        System.out.println(testString5 + " -> " + result5);
        System.out.println(testString6 + " -> " + result6);
    }

    private static void Task10() {
        String input1 = "exampleTest string";
        String input2 = "example string";
        String input3 = "example123 string";
        String input4 = "123example string";
        String input5 = "example_test string";

        String wordToMatch = "example";

        String regex = "^" + wordToMatch + "\\b";

        boolean result1 = input1.matches(regex);
        boolean result2 = input2.matches(regex);
        boolean result3 = input3.matches(regex);
        boolean result4 = input4.matches(regex);
        boolean result5 = input5.matches(regex);

        System.out.println(input1 + " -> " + result1);
        System.out.println(input2 + " -> " + result2);
        System.out.println(input3 + " -> " + result3);
        System.out.println(input4 + " -> " + result4);
        System.out.println(input5 + " -> " + result5);
    }

    private static void Task11() {
        String input1 = "exampleTest string";
        String input2 = "example string";
        String input3 = "example123 string";
        String input4 = "123example string";
        String input5 = "example_test string";

        String wordToMatch = "example";
        String regex = "^" + wordToMatch + "\\b";

        boolean result1 = input1.matches(regex);
        boolean result2 = input2.matches(regex);
        boolean result3 = input3.matches(regex);
        boolean result4 = input4.matches(regex);
        boolean result5 = input5.matches(regex);

        System.out.println(input1 + " -> " + result1); // true
        System.out.println(input2 + " -> " + result2); // true
        System.out.println(input3 + " -> " + result3); // true
        System.out.println(input4 + " -> " + result4); // false
        System.out.println(input5 + " -> " + result5); // true
    }

    private static void Task12() {
        String input1 = "This is a test.";
        String input2 = "Another example,";
        String input3 = "Yet another example";
        String input4 = "Test!";
        String input5 = "Final example.";

        String wordToMatch = "example";
        String regex = wordToMatch + "[,.!?]?\\b";

        boolean result1 = input1.matches(regex);
        boolean result2 = input2.matches(regex);
        boolean result3 = input3.matches(regex);
        boolean result4 = input4.matches(regex);
        boolean result5 = input5.matches(regex);

        System.out.println(input1 + " -> " + result1); // false
        System.out.println(input2 + " -> " + result2); // false
        System.out.println(input3 + " -> " + result3); // true
        System.out.println(input4 + " -> " + result4); // true
        System.out.println(input5 + " -> " + result5); // true
    }

    private static void Task13() {}

    private static void Task14() {}

    private static void Task15() {}

    private static void Task16() {}

    private static void Task17() {}

    private static void Task18() {}

    private static void Task19() {}

    private static void Task20() {}

    private static void Task21() {}

    private static void Task22() {}

    private static void Task23() {}

    private static void Task24() {}

    private static void Task25() {}

    private static void Task26() {}

    private static void Task27() {}

    private static void Task28() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = -1;

        while (task != 0) {
            System.out.println("\n\t\tNAVIGATION");
            System.out.println("Task 1 - enter 1");
            System.out.println("Task 2 - enter 2");
            System.out.println("Task 3 - enter 3");
            System.out.println("Task 4 - enter 4");
            System.out.println("Task 5 - enter 5");
            System.out.println("Task 6 - enter 6");
            System.out.println("Task 7 - enter 7");
            System.out.println("Task 8 - enter 8");
            System.out.println("Task 9 - enter 9");
            System.out.println("Task 10 - enter 10");
            System.out.println("Task 11 - enter 11");
            System.out.println("Task 12 - enter 12");
            System.out.println("Task 13 - enter 13");
            System.out.println("Task 14 - enter 14");
            System.out.println("Task 15 - enter 15");
            System.out.println("Task 16 - enter 16");
            System.out.println("Task 17 - enter 17");
            System.out.println("Task 18 - enter 18");
            System.out.println("Task 19 - enter 19");
            System.out.println("Task 20 - enter 20");
            System.out.println("Task 21 - enter 21");
            System.out.println("Task 22 - enter 22");
            System.out.println("Task 23 - enter 23");
            System.out.println("Task 24 - enter 24");
            System.out.println("Task 25 - enter 25");
            System.out.println("Task 26 - enter 26");
            System.out.println("Task 27 - enter 27");
            System.out.println("Task 28 - enter 28");
            System.out.println("EXIT - enter 0");
            task = scanner.nextInt();

            switch (task) {
                case 1: {
                    Task1();
                    break;
                }
                case 2: {
                    Task2();
                    break;
                }
                case 3: {
                    Task3();
                    break;
                }
                case 4: {
                    Task4();
                    break;
                }
                case 5: {
                    Task5();
                    break;
                }
                case 6: {
                    Task6();
                    break;
                }
                case 7: {
                    Task7();
                    break;
                }
                case 8: {
                    Task8();
                    break;
                }
                case 9: {
                    Task9();
                    break;
                }
                case 10: {
                    Task10();
                    break;
                }
                case 11: {
                    Task11();
                    break;
                }
                case 12: {
                    Task12();
                    break;
                }
                case 13: {
                    Task13();
                    break;
                }
                case 14: {
                    Task14();
                    break;
                }
                case 15: {
                    Task15();
                    break;
                }
                case 16: {
                    Task16();
                    break;
                }
                case 17: {
                    Task17();
                    break;
                }
                case 18: {
                    Task18();
                    break;
                }
                case 19: {
                    Task19();
                    break;
                }
                case 20: {
                    Task20();
                    break;
                }
                case 21: {
                    Task21();
                    break;
                }
                case 22: {
                    Task22();
                    break;
                }
                case 23: {
                    Task23();
                    break;
                }
                case 24: {
                    Task24();
                    break;
                }
                case 25: {
                    Task25();
                    break;
                }
                case 26: {
                    Task26();
                    break;
                }
                case 27: {
                    Task27();
                    break;
                }
                case 28: {
                    Task28();
                    break;
                }
                default:
                    break;
            }
        }
    }
}