package com.example.meal_planner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecipeDatabase {
    HashMap<Integer, Recipe> recipes;
    List<Integer> idList;


    public RecipeDatabase() {
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
        recipes.put(12, polsegryte() ) ;
        recipes.put(13,svinekam() ) ;
        recipes.put(14,omelett() ) ;


        idList = new ArrayList<>(recipes.keySet());
    }

    public HashMap<Integer, Recipe> getAllRecipes()
    {
        return recipes ;
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
        polsegryte() ;
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

        ingredientList.add(ingredient1) ;
        ingredientList.add(ingredient2) ;
        ingredientList.add(ingredient3) ;
        ingredientList.add(ingredient4) ;
        ingredientList.add(ingredient5) ;
        ingredientList.add(ingredient6) ;
        ingredientList.add(ingredient7) ;



        String instruction = "1. Knekk egg i en bolle og visp lett sammen. Krydre med litt salt og pepper.<br>" +

              "2. Kutt paprika i små biter. Ha paprika, skinke, svarte bønner og halvparten av osten i bollen med egg og rør sammen.<br>" +

              "3. Brett en tortillalefse utover en liten ildfast form og ha i eggeblandingen. Topp med resten av osten.<br>" +

              "4. Dekk formen med aluminiumsfolie og stek i ovnen på 175 grader i ca. 20 minutter. <br>";

        return  new Recipe("Omelett i ovn",ingredientList, instruction) ;

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

        String instruction = """

              1. Legg svinekammen i en ildfast form og krydre med pepper.<br>

              2.
              Skrell og del gulrot og løk i grove biter og legg dem rundt svinekammen sammen med timian.<br>

              Hell vannet i formen.<br>


              3. Sett formen midt i forvarmet ovn på 125 °C. Stikk et steketermometer inn i den tykkeste delen av kjøttet. Pass på at det ikke hviler mot bein. Kjøttet er ferdig når termometeret viser 68-72 °C. Dette tar 2 1/2 - 3 timer, avhengig av tykkelsen på kjøttet.""";
        return new Recipe("Svinekam",ingredientList, instruction) ;
    }
    public Recipe polsegryte()
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

        String instruction = """
              1. Fjern skinnet på pølsene, og skjær dem i 1/2 cm tykke skiver. Kutt brokkoli i små buketter. Husk også å ta med stilken - kutt den i grove biter. Sett pølser og brokkoli til side.

              2. Rens løk og hvitløk. Grovhakk løken og finhakk hvitløken.

              3. Ha pastaskruer, hermetisk tomat, buljong/vann og oregano i en stor gryte sammen med løk og hvitløk. Rør litt rundt så alt blander seg. Sett gryten på platen , og kok opp. Sett på lokk, og la det koke i ca. 10 minutter. Rør innimellom slik at det ikke svir seg i bunnen av gryten. Dersom du syns det er litt lite væske kan du ha i mer vann.

              4. Når gryten har småkokt under lokk i ca. 10 minutter, har du i pølser og brokkoli. Kok til alt er gjennomvarmt, og pastaen er "al dente", ca. 5 minutter til.

              5. Rør inn revet hvitost og fløte. Smak til med salt, pepper og eventuelt litt sukker.

              6. Ha i erter helt til slutt. Da får de akkurat nok varme, uten å miste den fine grønnfargen sin.""";

        return new Recipe("Lammekoteletter i form",ingredientList, instruction) ;
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

        String instruction = """
              1. Kutt grønnsaker i like store biter og ha over i en ildfast form.

              2. Krydre kotelettene med salt og pepper.

              3. Varm olje i en panne og brun kotelettene raskt på hver side.

              4. Legg kotelettene over i formen sammen med oliven, fetaost og timian.

              5. Ha på olje og stek i ovnen på 200 °C i ca. 20 minutter.""";

        return new Recipe("Lammekoteletter i form",ingredientList, instruction) ;

    }
    public Recipe grilletKylling()
    {
        List<Ingredient> ingredientList = new ArrayList<>() ;
        Ingredient ingredient1= new Ingredient("kyllingklubbe",5,"stk");
        Ingredient ingredient2= new Ingredient("bbq-saus",2,"ss");

        ingredientList.add(ingredient1) ;
        ingredientList.add(ingredient2) ;

        String instruction = """
              1. Legg kyllingklubbene i airfryeren med skinnet opp og stek på 180 °C i 15 minutter. Snu kyllingklubbene og stek videre i 15 minutter til skinnet er sprøtt. Tid kan variere mellom produsentene, så sjekk med jevne mellomrom for å unngå at det blir svidd.

              2. Pensle kyllingklubbene med bbq-saus og stek videre i 2-3 minutter til sausen har satt seg.""";

       return new Recipe("Kyllingklubber i airfrier",ingredientList, instruction) ;

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

        String instruction = """
              5. Hakk bladpersille. Bland bladpersillen inn i kjøttdeigen og form burgere, uten å jobbe for mye med deigen. Krydre burgerne med salt og pepper.

              6. Stek burgere i en stekepanne med smør eller olje. Bruk sterk varme og stek på den ene siden til det pipler ut kjøttsaft. Snu burgerne og stek videre på den andre siden til det igjen pipler ut kjøttsaft. Da er burgerne medium stekt. Skru ned varmen, og legg et par osteskiver på hver burger. Legg på et lokk til osten har smeltet.

              7. Varm hamburgerbrød raskt i stekepannen, eller som anvist på pakken. Kutt eple i tynne skiver. Smør på aioli, legg på babyspinat, epleskiver, hamburger og topp med baconmarmelade.""";

        return new Recipe("Burger med baconmarmolade",ingredientList, instruction) ;

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

        String instruction = """
              Skjær laksefilet i biter på ca 3x3 cm. kutt sitron i tynne skiver.
              Træ fiskebiter og sitronskiver annenhver gang på bløtlagte trespyd.
              Pensle grillristen med litt olje og grill spydene 2-3 minutter på hver side. Krydre med lett salt og pepper.
              Legg persille, oregano, koriander, hvitløk, eddik, sitronsaft og olje i en hurtigmikser eller  bruk stavmikser til å kjøre det sammen. Smak til med litt salt og pepper.""";

        return new Recipe("Grillspyd med laksefilet",ingredientList, instruction) ;

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

        String instruction = "La kjøttet ligge på kjøkkenbenken til det begynner å tine.<br>" +
                "Kok nudler etter anvisning på pakken. Hell av kokevannet og skyll i kaldt vann.<br>" +
                "Skjær rødløk i båter, paprika i biter, grønnkål i strimler og gulrot i staver.<br>" +
                "Stek kjøttet raskt i olje i flere omganger i en skikkelig varm wok eller panne, krydre med ingefær og allehånde. Tilsett grønnsaker etter 3-4 minutter, og stek videre i 3-4 minutter til alt er stekt og gjennomvarmt.<br>" +
                "Tilsett nudler, woksaus, og eventuelt litt vann. Vend alt forsiktig sammen og la det bli gjennomvarmt." ;
        return new Recipe("LammeWok",ingredientList, instruction) ;

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

        String instruction = "1. Kok spagetti etter anvisning på pakken. Hell av kokevannet, og husk å ta vare på 2-3 desiliter av kokevannet.<br>" +
                "<br>" +
                "2. Del gresskaret i to og grav ut kjernene. Bruk en skarp kniv og skjær vekk skallet. Del resten i biter.<br>" +
                "<br>" +
                "3. Varm oljen i en vid kjele og fres gresskarbiter og hvitløk på middels varme til de begynner å bli myke. <br>" +
                "<br>" +
                "4. Krydre med muskat, pepper og litt salt og hell i fløten. Kok opp, senk varmen og kok videre til gresskaret er helt mykt. Bruk stavmikser eller foodprocessor og kjør sausen helt glatt.<br>" +
                "<br>" +
                "5. Rør inn pastavann og revet parmesan og juster smaken med salt, pepper og sitronsaft. Kok opp og tilsett litt mer pastavann om du synes sausen er for tykk.<br>" +
                "<br>" +
                "6. Vend den kokte spagettien inn i sausen og la det hele bli gjennomvarmt. " ;
        return new Recipe("eksotisk levergryte",ingredientList, instruction) ;


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

        String instruction = "Rens lever og fjern hinner og grove ganger. Del i biter på 2-3 cm. <br>" +
                "Skjær løk i skiver og finhakk hvitløk. <br>" +
                "Varm en stekepanne med smør og stek løken til den er myk og blank.<br>" +
                "Ha løken over på en tallerken og varm opp stekepannen på nytt med resten av stekefettet. <br>" +
                "Tørk leverbitene med tørkepapir og stek dem på middels høy varme til de blir brune, og karamelliserte. <br>" +
                "Tilsett den stekte løken og fløte. La småkoke i 2-3 minutter og smak til med salt, pepper og sitronsaft. <br>" +
                "Grovhakk persille og dryss over rett før servering. " ;
        return new Recipe("Eksotisk levergryte",ingredientList, instruction) ;


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

        String instruction = """
              Tørk av kyllingfiletene med litt kjøkkenpapir. Krydre dem med salt og grovkvernet pepper og pensle dem med litt olje.
              Grill filetene i ca. 2 minutter på hver side på høy direkte varme og legg dem deretter over på indirekte varme, sett om mulig på lokk.<br>
              Ved grilling på direkte varme grilles maten rett over varmekilden. Ved grilling på indirekte varme ligger maten under lokk litt vekk fra varmekilden, i "den kalde sonen".
              Bruk aller helst steketermometer. Når filetene har en kjernetemperatur på 68 °C er de ferdige.<br>""";

        return new Recipe("Kylling filet",ingredientList, instruction) ;

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
        return new Recipe("Biff på primus",ingredientList, instruction) ;

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

        String instruction = """
            Temperer kjøttet og forvarm stekeovnen til 125 ºC.
            Tørk av kjøttet med litt kjøkkenpapir. Bland krydderet og krydre kjøttet.  Brun godt på alle sider i en varm stekepanne med smør. Ha kjøttet over i en ildfast form og stikk et steketermometer inn i den mest kjøttfulle delen. Stek til termometeret viser 74 °C. Dette tar 1 - 1,5timer. La svinekammen hvile i ca. 15 minutter før du skjærer i den.
            Vask spinat, skjær løk i tynne skiver og aprikos i strimler. Bland alle ingrediensene med olivenolje og kapers i en bolle. La stå minst ti minutter for at smakene skal sette seg.
            Kok poteter møre i lettsaltet vann.
            Server svinecarré med spinatsalat, kokte småpoteter, sennep, stekesjy og litt ekstra med hakkede urter i en skål.<br>""";

        return new Recipe("Svinecarret",ingredientList, instruction) ;

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

        String instruction = """
            SLIK GJØR DU<br>
            Forvarm ovnen til 220 °C.
             Knus einebær i en morter til det er finmalt.
            Rør snøfrisk og einebær sammen, og smør utover pizzabunnen .
            Dryss over revet ost.
            Skjær rødløk og reinsdyrbiff i tynne skiver, og fordel utover pizzabunnen.
            Legg over grønnkål og stek i ovnen i ca. 15 minutter.
            Server med granateple og frisk oregano!
            """;

        return new Recipe("Pizza med reinsdyrbiff",ingredientListForPizza, instruction) ;

    }


}
