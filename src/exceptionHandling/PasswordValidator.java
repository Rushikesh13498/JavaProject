package exceptionHandling;

class NoNumberException extends Exception {
    public NoNumberException(String message) {
        super(message);
    }
}

class PasswordValidator {
    public void validatePassword(String password) throws NoNumberException {
        boolean containsNumber = false;
        
        for (int i=0;i<password.length();i++) {
            if (password.charAt(i)>='0' && password.charAt(i)=='9') {
                containsNumber = true;
                break;
            }
        }

        if (!containsNumber) {
            throw new NoNumberException("Password must contain at least one number.");
        }
    }


    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String password = "abcxyz"; 

        try {
            validator.validatePassword(password);
            System.out.println("Password is valid.");
        } catch (NoNumberException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }
}
