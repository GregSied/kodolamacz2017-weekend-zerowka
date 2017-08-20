package pl.sages.kodolamacz.przyklad;

public class Example {

    public static void main(String[] args) {
        Verifier[] verifiers = {new PositiveVerifier(),
                new PositiveVerifier(),
                s -> s.length() > 10};

        for (Verifier verifier : verifiers) {
            verifier.verify("43");
        }
    }

}
