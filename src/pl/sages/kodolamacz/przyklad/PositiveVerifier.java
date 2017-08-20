package pl.sages.kodolamacz.przyklad;

public class PositiveVerifier implements Verifier{
    @Override
    public boolean verify(String s) {
        int i = Integer.valueOf(s);
        return i > 0;
    }
}
