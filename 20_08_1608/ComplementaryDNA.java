https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

import static java.util.stream.Collectors.joining;

public class DnaStrand {
  public static String makeComplement(String dna) {
    return dna.chars()
                .mapToObj(c -> (char) c)
                .map((c) -> {
                    switch (c) {
                        case 'A':
                            c = 'T';
                            break;
                        case 'T':
                            c = 'A';
                            break;
                        case 'C':
                            c = 'G';
                            break;
                        case 'G':
                            c = 'C';
                            break;
                        default:
                    }
                    return c;
                })
                .map(c -> c.toString())
                .collect(joining());
  }
}
