class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public static void main(String[] args) {
    // Code to test the class will go here
  }

}

class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public static void main(String[] args) {
    // Code to test the class will go here
  }

}

public static void main(String[] args) {
  Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();
}


public void getInfo() {
  System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
  System.out.println("The language follows the word order: " + this.wordOrder);
}

class Mayan extends Language {

}

class Mayan extends Language {

  Mayan(String languageName, int speakers) {
    super(languageName, speakers, "Central America", "verb-object-subject");
  }
}


@Override
public void getInfo() {
  super.getInfo();
  System.out.println("Fun fact: " + this.name + " is an ergative language.");
}


public static void main(String[] args) {
  // Existing Language instance
  Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();

  // New Mayan instance
  Mayan kiche = new Mayan("Ki'che'", 2330000);
  kiche.getInfo();
}


class SinoTibetan extends Language {

}


class SinoTibetan extends Language {

  SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");
  }
}


class SinoTibetan extends Language {

  SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");
    if (languageName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }
}


public static void main(String[] args) {
  // Existing Language instance
  Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();

  // New Mayan instance
  Mayan kiche = new Mayan("Ki'che'", 2330000);
  kiche.getInfo();

  // New SinoTibetan instances
  SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfo();

  SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfo();
}
