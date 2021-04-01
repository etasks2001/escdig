package ecd.util;

import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Util {
    private static final String REPLACEMENT = "";

    private static final String P_ASCII = "[^\\p{ASCII}]";

    public static String normalizeString(String string) {
	String f = (String) string;
	if (!Normalizer.isNormalized(string, Form.NFD)) {
	    String temp = Normalizer.normalize(string, Form.NFD);
	    f = temp.replaceAll(P_ASCII, REPLACEMENT);
	}
	return f.replace('º', '.').replace('ç', 'c').replace('´', '\'').replaceAll("[\n\r]", "").trim();
    }

}
