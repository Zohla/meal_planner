package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.*;

@Data
@AllArgsConstructor
@Service
public class MealPlanService {
  HashMap<Integer, Recipe> recipes;
  List<Integer> idList;

  public MealPlanService() {
    recipes = new HashMap<>();


    recipes.put(1,pizza() ) ;
    recipes.put(2,svinecarret() ) ;
    recipes.put(3,biff() ) ;
    recipes.put(4,kyllingfilet() ) ;
    recipes.put(5,levergryte()) ;
    recipes.put(6,pasta() ) ;
    recipes.put(7,lammewok() ) ;
    recipes.put(8,laksgrill() ) ;
    recipes.put(9,baconburger()) ;
    recipes.put(10,grilletKylling() ) ;
    recipes.put(11,lammekoteletter()) ;
    recipes.put(12,pølsegryte() ) ;
    recipes.put(13,svinekam() ) ;
    recipes.put(14,omelett() ) ;


    idList = new ArrayList<>(recipes.keySet());

    }

  // Method to generate list of 7 random recipes
  public HashMap<Integer, Recipe> generateWeeklyMenu() {

    HashMap<Integer, Recipe> thisWeek = new HashMap<>();

    Random random = new Random();
    Set<Integer> randNum = new HashSet<>();

    while (randNum.size() < 7) {

      int randIndex = random.nextInt(idList.size());
      randNum.add(idList.get(randIndex));

      for (int id : randNum) {
        thisWeek.put(id, recipes.get(id));
      }
    }
      return thisWeek;
  }

    /*public List<Recipe> replaceRecipe (List < Recipe > recipes,int index){
      List<Recipe> newList = new ArrayList<>();
      Random random = new Random();

      for (int i = 0; i < index; i++) {
        newList.add(recipes.get(i));

      int[]numbers = new int[7] ;
      for (int i=0;i<numbers.length;i++) {
        int randIndex = random.nextInt(idList.size());
        System.out.println(randIndex);
        if(isDublicate(numbers,randIndex))  {
          i--;
          System.out.println(i + "etter");
        }
          else
          numbers[i] = idList.get(randIndex) ;
      }
      for(int i=0;i< numbers.length;i++)
      {
        System.out.println("Array: " + numbers[i]);
      }
      for (int i=0;i<numbers.length;i++)
      {
        thisWeek.put(numbers[i], recipes.get(numbers[i])) ;
      }


      return thisWeek ;
      //return recipes.subList(0, 7);
    }*/
    public boolean isDublicate(int[]numbers, int newNumber)
    {
      for(int i=0;i<numbers.length;i++) {
        if (newNumber == numbers[i])
          return true;
      }
      return false ;
    }

    public List<Recipe> replaceRecipe(List<Recipe> recipes, int index){
      List<Recipe> newList = new ArrayList<>() ;
      Random random = new Random() ;
      for (int i=0;i<index;i++)
      {
        newList.add(recipes.get(i) ) ;

      }
      int recipeNumber = random.nextInt(recipes.size());// MÅ SJEKKES FOR DUPLIKAT
      newList.add(recipes.get(recipeNumber));
      for (int i = index + 1; i < recipes.size(); i++) {
        newList.add(recipes.get(i));
      }

      return newList;
    }

   public void createRecipe()
    {
      pizza();
      svinecarret();
      biff();
      kyllingfilet();
      levergryte();
      pasta();
      lammewok();
      laksgrill();
      baconburger();
      grilletKylling() ;
      lammekoteletter() ;
      pølsegryte() ;
      svinekam();
      omelett();



    }
    public Recipe omelett()
    {

      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("egg",3,"stk");
      Ingredient ingredient2= new Ingredient("salt",0.25,"teskje");
      Ingredient ingredient3= new Ingredient("kværnet pepper",0.5,"teskje");
      Ingredient ingredient4= new Ingredient("paprika",1,"stk");
      Ingredient ingredient5= new Ingredient("smårettsskinke",0.5,"dl");
      Ingredient ingredient6= new Ingredient("revet ost",1,"dl");
      Ingredient ingredient7= new Ingredient("tortillalafse",1,"stor");


      String instruction = "1. Knekk egg i en bolle og visp lett sammen. Krydre med litt salt og pepper. \n" +
              "\n" +
              "2. Kutt paprika i små biter. Ha paprika, skinke, svarte bønner og halvparten av osten i bollen med egg og rør sammen.  \n" +
              "\n" +
              "3. Brett en tortillalefse utover en liten ildfast form og ha i eggeblandingen. Topp med resten av osten.  \n" +
              "\n" +
              "4. Dekk formen med aluminiumsfolie og stek i ovnen på 175 grader i ca. 20 minutter.  " ;

      Recipe recipe = new Recipe("Omelett i ovn",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe svinekam()
    {

      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("røkt svinekam",2,"kg");
      Ingredient ingredient2= new Ingredient("kværnet pepper",0.5,"teskje");
      Ingredient ingredient3= new Ingredient("gulrot",2,"stk");
      Ingredient ingredient4= new Ingredient("løk",2,"stk");
      Ingredient ingredient5= new Ingredient("frisk timian",2,"kvister");
      Ingredient ingredient6= new Ingredient("vann",3,"dl");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;

      String instruction = "\n" +
              "1. Legg svinekammen i en ildfast form og krydre med pepper. \n" +
              "\n" +
              "2.\n" +
              "Skrell og del gulrot og løk i grove biter og legg dem rundt svinekammen sammen med timian.\n" +
              "\n" +
              "Hell vannet i formen. \n" +
              "\n" +
              "\n" +
              "3. Sett formen midt i forvarmet ovn på 125 °C. Stikk et steketermometer inn i den tykkeste delen av kjøttet. Pass på at det ikke hviler mot bein. Kjøttet er ferdig når termometeret viser 68-72 °C. Dette tar 2 1/2 - 3 timer, avhengig av tykkelsen på kjøttet." ;
      Recipe recipe = new Recipe("Svinekam",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe pølsegryte()
    {

      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("kjøttpølse",400,"gram");
      Ingredient ingredient2= new Ingredient("brokkoli",0.5,"stk");
      Ingredient ingredient3= new Ingredient("løk",1,"stk");
      Ingredient ingredient4= new Ingredient("hvitløk",1,"båt");
      Ingredient ingredient5= new Ingredient("fullkornpastaskruer",400,"gram");
      Ingredient ingredient6= new Ingredient("hakkede hermetiske tomater",400,"gram");
      Ingredient ingredient7= new Ingredient("vann",4,"dl");
      Ingredient ingredient8= new Ingredient("tørket oregano",1,"teskje");
      Ingredient ingredient9= new Ingredient("revet hvitost",100,"gram");
      Ingredient ingredient10= new Ingredient("matfløte",2,"dl");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;
      ingredientList.add(ingredient8) ;
      ingredientList.add(ingredient9) ;
      ingredientList.add(ingredient10) ;

      String instruction = "1. Fjern skinnet på pølsene, og skjær dem i 1/2 cm tykke skiver. Kutt brokkoli i små buketter. Husk også å ta med stilken - kutt den i grove biter. Sett pølser og brokkoli til side.\n" +
              "\n" +
              "2. Rens løk og hvitløk. Grovhakk løken og finhakk hvitløken.\n" +
              "\n" +
              "3. Ha pastaskruer, hermetisk tomat, buljong/vann og oregano i en stor gryte sammen med løk og hvitløk. Rør litt rundt så alt blander seg. Sett gryten på platen , og kok opp. Sett på lokk, og la det koke i ca. 10 minutter. Rør innimellom slik at det ikke svir seg i bunnen av gryten. Dersom du syns det er litt lite væske kan du ha i mer vann.\n" +
              "\n" +
              "4. Når gryten har småkokt under lokk i ca. 10 minutter, har du i pølser og brokkoli. Kok til alt er gjennomvarmt, og pastaen er \"al dente\", ca. 5 minutter til.\n" +
              "\n" +
              "5. Rør inn revet hvitost og fløte. Smak til med salt, pepper og eventuelt litt sukker.\n" +
              "\n" +
              "6. Ha i erter helt til slutt. Da får de akkurat nok varme, uten å miste den fine grønnfargen sin." ;

      Recipe recipe = new Recipe("Lammekoteletter i form",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe lammekoteletter()
    {

      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("grønn squash",1,"stk");
      Ingredient ingredient2= new Ingredient("gul paprika",1,"stk");
      Ingredient ingredient3= new Ingredient("rød paprika",1,"stk");
      Ingredient ingredient4= new Ingredient("rødløk",1,"stk");
      Ingredient ingredient5= new Ingredient("lammekoteletter",4,"stk");
      Ingredient ingredient6= new Ingredient("olje",3,"ss");
      Ingredient ingredient7= new Ingredient("sorte oliven",130,"gram");
      Ingredient ingredient8= new Ingredient("fetaost",50,"gram");
      Ingredient ingredient9= new Ingredient("frisk timian",2,"ss");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;
      ingredientList.add(ingredient8) ;
      ingredientList.add(ingredient9) ;

      String instruction = "1. Kutt grønnsaker i like store biter og ha over i en ildfast form.\n" +
              "\n" +
              "2. Krydre kotelettene med salt og pepper.\n" +
              "\n" +
              "3. Varm olje i en panne og brun kotelettene raskt på hver side.\n" +
              "\n" +
              "4. Legg kotelettene over i formen sammen med oliven, fetaost og timian.\n" +
              "\n" +
              "5. Ha på olje og stek i ovnen på 200 °C i ca. 20 minutter." ;

      Recipe recipe = new Recipe("Lammekoteletter i form",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe grilletKylling()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("kyllingklubbe",5,"stk");
      Ingredient ingredient2= new Ingredient("bbq-saus",2,"ss");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;

      String instruction = "1. Legg kyllingklubbene i airfryeren med skinnet opp og stek på 180 °C i 15 minutter. Snu kyllingklubbene og stek videre i 15 minutter til skinnet er sprøtt. Tid kan variere mellom produsentene, så sjekk med jevne mellomrom for å unngå at det blir svidd.\n" +
              "\n" +
              "2. Pensle kyllingklubbene med bbq-saus og stek videre i 2-3 minutter til sausen har satt seg." ;

      Recipe recipe = new Recipe("Kyllingklubber i airfrier",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe baconburger()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("kjøttdeig",300,"gram");
      Ingredient ingredient2= new Ingredient("bladpersille",1,"ss");
      Ingredient ingredient3= new Ingredient("salt",0.5,"teskje");
      Ingredient ingredient4= new Ingredient("pepper",1,"teskje");
      Ingredient ingredient5= new Ingredient("smør",1,"ss");
      Ingredient ingredient6= new Ingredient("gulost",4,"skiver");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;

      String instruction = "5. Hakk bladpersille. Bland bladpersillen inn i kjøttdeigen og form burgere, uten å jobbe for mye med deigen. Krydre burgerne med salt og pepper.\n" +
              "\n" +
              "6. Stek burgere i en stekepanne med smør eller olje. Bruk sterk varme og stek på den ene siden til det pipler ut kjøttsaft. Snu burgerne og stek videre på den andre siden til det igjen pipler ut kjøttsaft. Da er burgerne medium stekt. Skru ned varmen, og legg et par osteskiver på hver burger. Legg på et lokk til osten har smeltet.\n" +
              "\n" +
              "7. Varm hamburgerbrød raskt i stekepannen, eller som anvist på pakken. Kutt eple i tynne skiver. Smør på aioli, legg på babyspinat, epleskiver, hamburger og topp med baconmarmelade.";

      Recipe recipe = new Recipe("Burger med baconmarmolade",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe laksgrill()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("laksefilet",800,"gram");
      Ingredient ingredient2= new Ingredient("sitron",2,"stk");
      Ingredient ingredient3= new Ingredient("bladpersille",1,"bunt");
      Ingredient ingredient4= new Ingredient("hakket frisk oregano",2,"ss");
      Ingredient ingredient5= new Ingredient("frisk hakket koriander",2,"ss");
      Ingredient ingredient6= new Ingredient("hvitløk",2,"båter");
      Ingredient ingredient7= new Ingredient("rødvinseddik",2,"ss");
      Ingredient ingredient8= new Ingredient("sitronsaft",1,"ss");
      Ingredient ingredient9= new Ingredient("olivenolje",1,"dl");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;
      ingredientList.add(ingredient8) ;
      ingredientList.add(ingredient9) ;

      String instruction = "Skjær laksefilet i biter på ca 3x3 cm. kutt sitron i tynne skiver.\n" +
              "Træ fiskebiter og sitronskiver annenhver gang på bløtlagte trespyd.\n" +
              "Pensle grillristen med litt olje og grill spydene 2-3 minutter på hver side. Krydre med lett salt og pepper.\n" +
              "Legg persille, oregano, koriander, hvitløk, eddik, sitronsaft og olje i en hurtigmikser eller  bruk stavmikser til å kjøre det sammen. Smak til med litt salt og pepper." ;

      Recipe recipe = new Recipe("Grillspyd med laksefilet",ingredientList, instruction) ;
      return recipe ;
    }
    public Recipe lammewok()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("lammeskav",600,"gram");
      Ingredient ingredient2= new Ingredient("nudler",300,"gram");
      Ingredient ingredient3= new Ingredient("rødløk",1,"stk");
      Ingredient ingredient4= new Ingredient("rød paprika",1,"stk");
      Ingredient ingredient5= new Ingredient("grønnkål",300,"gram");
      Ingredient ingredient6= new Ingredient("gulrot",2,"stk");
      Ingredient ingredient7= new Ingredient("rapsolje til steking",4,"ss");
      Ingredient ingredient8= new Ingredient("malt ingefær",1,"teskje");
      Ingredient ingredient9= new Ingredient("allehånde",0.5,"teskje");
      Ingredient ingredient10= new Ingredient("ferdig woksaus",1,"glass");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;
      ingredientList.add(ingredient8) ;
      ingredientList.add(ingredient9) ;
      ingredientList.add(ingredient10) ;

      String instruction = "La kjøttet ligge på kjøkkenbenken til det begynner å tine.\n" +
              "Kok nudler etter anvisning på pakken. Hell av kokevannet og skyll i kaldt vann.\n" +
              "Skjær rødløk i båter, paprika i biter, grønnkål i strimler og gulrot i staver.\n" +
              "Stek kjøttet raskt i olje i flere omganger i en skikkelig varm wok eller panne, krydre med ingefær og allehånde. Tilsett grønnsaker etter 3-4 minutter, og stek videre i 3-4 minutter til alt er stekt og gjennomvarmt.\n" +
              "Tilsett nudler, woksaus, og eventuelt litt vann. Vend alt forsiktig sammen og la det bli gjennomvarmt." ;
      Recipe recipe = new Recipe("LammeWok",ingredientList, instruction) ;
      return recipe ;
    }
    private Recipe pasta()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("Spagetti",250,"gram");
      Ingredient ingredient2= new Ingredient("hollaidogresskar",250,"stk");
      Ingredient ingredient3= new Ingredient("olje",2,"ss");
      Ingredient ingredient4= new Ingredient("hvirløk",2,"båter");
      Ingredient ingredient5= new Ingredient("muskat",0.25,"teskje");
      Ingredient ingredient6= new Ingredient("pepper",0.25,"teskje");
      Ingredient ingredient7= new Ingredient("fløte",3,"dl");
      Ingredient  ingredient8= new Ingredient("revet parmesan",2,"dl");
      Ingredient  ingredient9= new Ingredient("sitronsaft",2,"ss");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;
      ingredientList.add(ingredient8) ;
      ingredientList.add(ingredient9) ;

      String instruction = "1. Kok spagetti etter anvisning på pakken. Hell av kokevannet, og husk å ta vare på 2-3 desiliter av kokevannet.\n" +
              "\n" +
              "2. Del gresskaret i to og grav ut kjernene. Bruk en skarp kniv og skjær vekk skallet. Del resten i biter.\n" +
              "\n" +
              "3. Varm oljen i en vid kjele og fres gresskarbiter og hvitløk på middels varme til de begynner å bli myke. \n" +
              "\n" +
              "4. Krydre med muskat, pepper og litt salt og hell i fløten. Kok opp, senk varmen og kok videre til gresskaret er helt mykt. Bruk stavmikser eller foodprocessor og kjør sausen helt glatt.\n" +
              "\n" +
              "5. Rør inn pastavann og revet parmesan og juster smaken med salt, pepper og sitronsaft. Kok opp og tilsett litt mer pastavann om du synes sausen er for tykk.\n" +
              "\n" +
              "6. Vend den kokte spagettien inn i sausen og la det hele bli gjennomvarmt. " ;
      Recipe recipe = new Recipe("eksotisk levergryte",ingredientList, instruction) ;
      return recipe ;

    }
    private Recipe levergryte()
    {
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("lever av kalv",500,"gram");
      Ingredient ingredient2= new Ingredient("løk",2,"stk");
      Ingredient ingredient3= new Ingredient("hvitløk",2,"båter");
      Ingredient ingredient4= new Ingredient("smør",2,"ss");
      Ingredient ingredient5= new Ingredient("fløte",2,"dl");
      Ingredient ingredient6= new Ingredient("sitronsaft",2,"ss");
      Ingredient ingredient7= new Ingredient("bladepersille",2,"ss");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;
      ingredientList.add(ingredient7) ;

      String instruction = "Rens lever og fjern hinner og grove ganger. Del i biter på 2-3 cm. \n" +
              "Skjær løk i skiver og finhakk hvitløk. \n" +
              "Varm en stekepanne med smør og stek løken til den er myk og blank.\n" +
              "Ha løken over på en tallerken og varm opp stekepannen på nytt med resten av stekefettet. \n" +
              "Tørk leverbitene med tørkepapir og stek dem på middels høy varme til de blir brune, og karamelliserte. \n" +
              "Tilsett den stekte løken og fløte. La småkoke i 2-3 minutter og smak til med salt, pepper og sitronsaft. \n" +
              "Grovhakk persille og dryss over rett før servering. " ;
      Recipe recipe = new Recipe("Eksotisk levergryte",ingredientList, instruction) ;
      return recipe ;

    }

    private Recipe kyllingfilet(){
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("kyllingfilet",4,"stk");
      Ingredient ingredient2= new Ingredient("olje",1,"ss");
      Ingredient ingredient3= new Ingredient("salt",1,"teskje");
      Ingredient ingredient4= new Ingredient("pepper",0.5,"teskje");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;

      String instruction = "Tørk av kyllingfiletene med litt kjøkkenpapir. Krydre dem med salt og grovkvernet pepper og pensle dem med litt olje.\n" +
              "Grill filetene i ca. 2 minutter på hver side på høy direkte varme og legg dem deretter over på indirekte varme, sett om mulig på lokk. \n" +
              "Ved grilling på direkte varme grilles maten rett over varmekilden. Ved grilling på indirekte varme ligger maten under lokk litt vekk fra varmekilden, i \"den kalde sonen\".\n" +
              "Bruk aller helst steketermometer. Når filetene har en kjernetemperatur på 68 °C er de ferdige. ";

      Recipe recipe = new Recipe("Kylling filet",ingredientList, instruction) ;
      return recipe ;
  }

    private Recipe biff(){
      List<Ingredient> ingredientList = new ArrayList<>() ;
      Ingredient ingredient1= new Ingredient("ytrefilet av storfe",400,"gram");
      Ingredient ingredient2= new Ingredient("margarin",1,"ss");
      Ingredient ingredient3= new Ingredient("salt",0.5,"teskje");
      Ingredient ingredient4= new Ingredient("pepper",0.25,"teskje");
      Ingredient ingredient5= new Ingredient("pitabrød",2,"stk");
      Ingredient ingredient6= new Ingredient("fetaost",50,"gram");

      ingredientList.add(ingredient1) ;
      ingredientList.add(ingredient2) ;
      ingredientList.add(ingredient3) ;
      ingredientList.add(ingredient4) ;
      ingredientList.add(ingredient5) ;
      ingredientList.add(ingredient6) ;

      String instruction= "Skal du på tur og kose deg skikkelig - da skal du steke biff på primus! Biffen kan du marinere hjemme i for eksempel en urtemarinade og ta med deg på turen i en zip-lock pose, eller ta med deg en vakuumpakket fra butikken. Server biffen med en enkel tomatsalat, urtesalsa og godt brød. ";
      Recipe recipe = new Recipe("Biff på primus",ingredientList, instruction) ;
      return recipe ;
  }

  private Recipe svinecarret() {

    List<Ingredient> ingredientList = new ArrayList<>() ;
    Ingredient ingredient1= new Ingredient("svinecarre",500,"gram");
    Ingredient ingredient2= new Ingredient("salt",2,"teskje");
    Ingredient ingredient3= new Ingredient("kværnet pepper",2,"teskje");
    Ingredient ingredient4= new Ingredient("malt allehånde",1,"teskje");
    Ingredient ingredient5= new Ingredient("malt ingefær",0.5,"teskje");
    Ingredient ingredient6= new Ingredient("smør",2,"ss");
    Ingredient ingredient7= new Ingredient("hvitløl",4,"båter");
    Ingredient ingredient8= new Ingredient("små potet",16,"stk");

    ingredientList.add(ingredient1) ;
    ingredientList.add(ingredient2) ;
    ingredientList.add(ingredient3) ;
    ingredientList.add(ingredient4) ;
    ingredientList.add(ingredient5) ;
    ingredientList.add(ingredient6) ;
    ingredientList.add(ingredient7) ;
    ingredientList.add(ingredient8) ;

    String instruction = "Temperer kjøttet og forvarm stekeovnen til 125 ºC.\n" +
            "Tørk av kjøttet med litt kjøkkenpapir. Bland krydderet og krydre kjøttet.  Brun godt på alle sider i en varm stekepanne med smør. Ha kjøttet over i en ildfast form og stikk et steketermometer inn i den mest kjøttfulle delen. Stek til termometeret viser 74 °C. Dette tar 1 - 1,5timer. La svinekammen hvile i ca. 15 minutter før du skjærer i den.\n" +
            "Vask spinat, skjær løk i tynne skiver og aprikos i strimler. Bland alle ingrediensene med olivenolje og kapers i en bolle. La stå minst ti minutter for at smakene skal sette seg.\n" +
            "Kok poteter møre i lettsaltet vann.\n" +
            "Server svinecarré med spinatsalat, kokte småpoteter, sennep, stekesjy og litt ekstra med hakkede urter i en skål. ";

    Recipe recipe = new Recipe("Svinecarret",ingredientList, instruction) ;
    return recipe ;
  }

  private Recipe pizza() {
    List<Ingredient> ingredientListForPizza = new ArrayList<>() ;

    Ingredient ingredient1ForPizza= new Ingredient("einebær",1,"teskje");
    Ingredient ingredient2ForPizza= new Ingredient("frisk naturell",1 ,"boks");
    Ingredient ingredient3ForPizza= new Ingredient("pizzabunn",1 ,"stk");
    Ingredient ingredient4ForPizza= new Ingredient("revet ost",1 ,"håndfull");
    Ingredient ingredient5ForPizza= new Ingredient("rødløk",1 ,"stk");
    Ingredient ingredient6ForPizza= new Ingredient("flatbiff av reinsdyr",100 ,"gram");
    Ingredient ingredient7ForPizza= new Ingredient("grønnkål",1 ,"håndfull");
    Ingredient ingredient8ForPizza= new Ingredient("granateple",1 ,"ss");
    Ingredient ingredient9ForPizza= new Ingredient("frisk oregano",1 ,"håndfull");

    ingredientListForPizza.add(ingredient1ForPizza) ;
    ingredientListForPizza.add(ingredient2ForPizza) ;
    ingredientListForPizza.add(ingredient3ForPizza) ;
    ingredientListForPizza.add(ingredient4ForPizza) ;
    ingredientListForPizza.add(ingredient5ForPizza) ;
    ingredientListForPizza.add(ingredient6ForPizza) ;
    ingredientListForPizza.add(ingredient7ForPizza) ;
    ingredientListForPizza.add(ingredient8ForPizza) ;
    ingredientListForPizza.add(ingredient9ForPizza) ;

    String instruction = "SLIK GJØR DU \n"+
            "Forvarm ovnen til 220 °C.\n "+
            "Knus einebær i en morter til det er finmalt.\n" +
            "Rør snøfrisk og einebær sammen, og smør utover pizzabunnen .\n"  +
            "Dryss over revet ost.\n" +
            "Skjær rødløk og reinsdyrbiff i tynne skiver, og fordel utover pizzabunnen.\n"+
            "Legg over grønnkål og stek i ovnen i ca. 15 minutter.\n" +
            "Server med granateple og frisk oregano!\n" ;

    Recipe recipe = new Recipe("Pizza med reinsdyrbiff",ingredientListForPizza, instruction) ;
    return recipe  ;
  }

    // Method to add new recipe to list
    public void addRecipe (Recipe recipe){
      // TODO: check if exists
      // TODO: get last used id, set current to id + 1
      //    recipes.put(id, recipe);
    }

    // Method to get recipe by id
    public Recipe getRecipeById ( int id){
      return recipes.get(id);
    }

    // Pagination
    public List<Integer> getIdPageSubList ( int page, int pageSize){
      int from = Math.max(0, page * pageSize);
      int to = Math.min(idList.size(), (page + 1) * pageSize);

      return idList.subList(from, to);
    }

    public int numberOfPages ( int pageSize){
      return (int) Math.ceil((double) recipes.size() / pageSize);
    }

  }