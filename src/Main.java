import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.spi.CurrencyNameProvider;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        //main.JavaStdinAndStdoutI();
        //main.JavaIfElse();
        //main.JavaStdinAndStdoutII();
        //main.JavaLoopsI();
        //main.JavaLoopsII();
        //main.JavaDataTypes();
        //main.JavaOutputFormatting();
        //main.JavaStaticInitializerBlock();
        //main.JavaEndOfFile();
        //main.JavaIntToString();
        //System.out.println(main.JavaDateAndTime(8,5,2015));
        //main.JavaCurrencyFormatter();
        //main.JavaStringsIntroduction();
        //main.JavaSubstring();
        //main.JavaStringTokens();
        //main.PatternSyntaxChecker();

        //Java Regex
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String IP = scanner.next();
//            System.out.println(IP.matches(new JavaRegex().pattern));
//        }
        //Java regex
     //   main.JavaRegex2();
    }
    public void WelcomeToJava(){
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    public void JavaStdinAndStdoutI() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(scanner.nextInt());
        }
    }

    public void JavaIfElse() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
    public void JavaStdinAndStdoutII(){
        Scanner scanner = new Scanner(System.in);
        Integer integer = scanner.nextInt();
        scanner.nextLine();
        Double  dbl = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();
        System.out.println("String: " +string);
        System.out.println("Double: "+dbl);
        System.out.println("Int: "+integer);
    }
    public void JavaOutputFormatting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string = scanner.next();
            Integer integer = scanner.nextInt();
            System.out.format("%-15s%03d%n", string, integer);
        }
        System.out.println("================================");

    }
   public void JavaLoopsI() throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(bufferedReader.readLine().trim());
       bufferedReader.close();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = " +(N*i));
        }
   }


    public void JavaLoopsII() {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int[] ans = new int[n];
            int x = 0;
            for (int j = 0; j < n; j++) {
                ans[j] = (int) ((a + Math.pow(2, j) * b) + x);
                a = 0;
                x = ans[j];
                System.out.print(ans[j] + " ");
            }

//            for(int j=0;j<ans.length;j++){
//                System.out.print(ans[j]+" ");
//            }
            System.out.println();
        }
    }

    public void JavaDataTypes() {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {

                for (int j = 1; j < 2; j++) {
                    Long match = scanner.nextLong();
                    if (match >= Byte.MIN_VALUE && match <= Byte.MAX_VALUE) {
                        System.out.println(match + " can be fitted in: ");
                        System.out.println("* byte");
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
                    }
                    if (match >= Short.MIN_VALUE && match <= Short.MAX_VALUE) {
                        System.out.println(match + " can be fitted in: ");
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
                    }
                    if (match >= Integer.MIN_VALUE && match <= Integer.MAX_VALUE) {
                        System.out.println(match + " can be fitted in: ");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
                    }
                    if (match >= Long.MIN_VALUE && match <= Long.MAX_VALUE) {
                        System.out.println(match + " can be fitted in: ");
                        System.out.println("* long");
                        break;
                    } else {

                    }
                }

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }

    }

    public void JavaEndOfFile() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
    }

    public void JavaStaticInitializerBlock() {
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        Integer breadth = scanner.nextInt();
        try {
            if (height > 0 && breadth > 0) {
                System.out.println(breadth * height);
            } else {
                java.lang.Exception exception = new Exception("Breadth and height must be positive");
                throw exception;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void JavaIntToString() {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        String string = String.valueOf(number);
        String answer = (number == (Integer.parseInt(string))) ? "Good job" : "Wrong answer.";
        System.out.println(answer);
    }

    public String JavaDateAndTime(int month, int day, int year) {
        Date date = new GregorianCalendar(year, month - 1, day).getTime();
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        return dateFormat.format(date).toUpperCase();
    }

    public void JavaCurrencyFormatter() {
//        Scanner scanner = new Scanner(System.in);
//        Double value = scanner.nextDouble();
//        NumberFormat forUS = NumberFormat.getCurrencyInstance();
//        forUS.setCurrency(Currency.getInstance(Locale.US));
//        System.out.println(Locale.US.getCountry()+": "+forUS.format(value));
//
//        Locale locale = new Locale("English","India","India");
//        NumberFormat forIndia = NumberFormat.getNumberInstance();
//        forIndia.setMaximumFractionDigits(2);
//        System.out.println(locale.getVariant()+": Rs."+forIndia.format(value));
//
//        NumberFormat forChina = NumberFormat.getCurrencyInstance();
//        forChina.setCurrency(Currency.getInstance(Locale.SIMPLIFIED_CHINESE));
//        System.out.println(Locale.SIMPLIFIED_CHINESE.getDisplayCountry()+": "+forChina.getCurrency().getSymbol().replace("CN","")+forChina.format(value).replace("CN¥",""));
//
//        NumberFormat forFrance = NumberFormat.getCurrencyInstance();
//        forFrance.setCurrency(Currency.getInstance(Locale.FRANCE));
//        System.out.println(Locale.FRANCE.getDisplayCountry()+": "+forFrance.format(value).replace("€","")+" "+forFrance.getCurrency().getSymbol());
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        Locale indiaLocale = new Locale("en", "in");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getInstance();
        india.setMaximumFractionDigits(2);

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + us.format(payment));
        System.out.println("India: Rs." + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }

    public void JavaStringsIntroduction() {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        String[] strings = {A, B};
        Integer greater = A.compareTo(B);
        String answer = (greater > 0) ? "Yes" : "No";
        System.out.println(A.length() + B.length());
        System.out.println(answer);
        Arrays.stream(strings).forEach(s -> System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " "));
    }

    public void JavaSubstring() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        //Integer start = scanner.nextInt();
        //Integer end = scanner.nextInt();
        String truncated = string.substring(scanner.nextInt(), scanner.nextInt());
        System.out.println(truncated);
    }

    public void JavaSubstringComparisons() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        Integer length = scanner.nextInt();
        Integer end = length;
        List<String> cutStrings = new ArrayList<>();
        for (int i = 0; i < string.length() - (length - 1); i++) {
            cutStrings.add(i, string.substring(i, end));
            end++;
        }
        String [] strings = new String[cutStrings.size()];
        for(int i=0;i<cutStrings.size();i++){
            strings[i]= cutStrings.get(i);
        }
        Arrays.sort(strings);
        System.out.println(strings[0]);
        System.out.println(strings[strings.length-1]);

//        List<String> resultStrings = cutStrings.stream().sorted().toList();
//        System.out.println(resultStrings.get(0));
//        System.out.println(resultStrings.get(cutStrings.size() - 1));

//        cutStrings.stream().filter(s -> cutStrings.get(0).equals(s) || cutStrings.get(cutStrings.size()-1).equals(s)).forEach(s -> System.out.println(s));
    }

    public void JavaStringReverse() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String reverse = "";
        for (int i = 0; i < string.length(); i++) {
            reverse = reverse + string.charAt(string.length() - (i + 1));
        }
        if (string.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void JavaAnagrams() {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next().toLowerCase();
        String string2 = scanner.next().toLowerCase();
        char[] forString1 = string1.toCharArray();
        char[] forString2 = string2.toCharArray();
        Arrays.sort(forString1);
        Arrays.sort(forString2);
        Boolean answer = Arrays.equals(forString1, forString2);
        String print = answer.equals(true) ? "Anagrams" : "Not Anagrams";
        System.out.println(print);
    }

    public void JavaStringTokens() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.trim();
        String[] answers = string.split("[^a-zA-Z]+");
        if (string == "") {
            System.out.println(0);
        } else {
            System.out.println(answers.length);
            Arrays.stream(answers).forEach(s -> System.out.println(s));
        }
    }

    public void PatternSyntaxChecker() {
        Scanner scanner = new Scanner(System.in);
        Integer times = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < times; i++) {
            String string = scanner.nextLine();
            try {
                Pattern.compile(string);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }

    private static class JavaRegex {
        String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
        public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
    }
    public void JavaRegex2(){
        Scanner scanner = new Scanner(System.in);
        Integer times = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<times;i++){
            String string = scanner.nextLine();
            String [] words = string.split(" ");
            Set<String> unique = new HashSet<>();
            StringBuilder sentence = new StringBuilder();
            for(String word:words){
                String lowercaseWord = word.toLowerCase();
                if (!unique.contains(lowercaseWord)){
                    unique.add(lowercaseWord);
                    sentence.append(word).append(" ");
                }
            }
            System.out.println(sentence.toString().trim());
        }
    }
}
