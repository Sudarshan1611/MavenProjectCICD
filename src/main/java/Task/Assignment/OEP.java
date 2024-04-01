package Task.Assignment;

public class OEP {
    public String play(int number) {
        if (number % 2 == 0) {
            return "EVEN";
        } else if (isPrime(number)) {
        	if(number % 2 == 1 )
            return "ODD and PRIME";
        } else {
            return "ODD";
        }
		return null;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
