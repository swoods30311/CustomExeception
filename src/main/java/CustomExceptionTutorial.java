public class CustomExceptionTutorial {
    public static void main(String[] args) throws Exception {
        validateAge(-8);
    }

    private static void validateAge(int age) throws Exception {
        if (age < 0) {
            throw new AgeLessThanZeroException("Age has to be a Positive Whole Number");
        }
    }
}
