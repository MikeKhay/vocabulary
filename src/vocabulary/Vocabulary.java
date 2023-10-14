package vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) {

//        IrregularVerb verb = new IrregularVerb("Do", "Did", "Done", "Робити");

        List<Word> words = getWords();

        while (words.size() != 0) {
            Random ran = new Random();
            int index = ran.nextInt(words.size());

            Word word = words.get(index);
            System.out.println("List size: " + words.size());

            System.out.println(word.getT());

            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            if (s.equalsIgnoreCase(word.getW())) {
                System.out.println("true");
                words.remove(index);
            } else {
                System.out.println("false. " + word);
            }
            System.out.println("====================================================");
        }

        System.out.println("LIST IS EMPTY");
    }

    public static List<Word> getWords() {
        List<Word> words = new ArrayList<>();

        words.add(new Word("hello", "привіт"));
        words.add(new Word("dog", "собака"));
        words.add(new Word("cat", "кіт"));

        //CHAPTER 1
        //Family and friends
        words.add(new Word("father", "тато"));
        words.add(new Word("mother", "мама"));
        words.add(new Word("brother", "брат"));
        words.add(new Word("sister", "сестра"));
        words.add(new Word("son", "син"));
        words.add(new Word("daughter", "донька"));
        words.add(new Word("grandmother", "бабуся"));
        words.add(new Word("grandfather", "дідусь"));
        words.add(new Word("grandson", "онук"));
        words.add(new Word("granddaughter", "онучка"));
        words.add(new Word("uncle", "дядько"));
        words.add(new Word("aunt", "тітка"));
        words.add(new Word("cousin", "двоюрідний брат або сестра"));
        words.add(new Word("nephew", "племіник"));
        words.add(new Word("niece", "племіниця"));
        words.add(new Word("father-in-law", "тесть або свекор"));
        words.add(new Word("mother-in-law", "теща фбо свекруха"));
        words.add(new Word("brother-in-law", "братовий"));
        words.add(new Word("sister-in-law", "братова"));
        words.add(new Word("great-grandfather", "пра-прадід"));
        words.add(new Word("great-grandmother", "пра-прабаба"));
        words.add(new Word("step-daughter", "пасербниця"));
        words.add(new Word("step-father", "вітчим"));
        words.add(new Word("step-mother", "мачуха"));
        words.add(new Word("step-brother", "зведений брат"));
        words.add(new Word("step-sister", "зведена сестра"));
        words.add(new Word("step-son", "пасинок"));
        words.add(new Word("husband", "чоловік"));
        words.add(new Word("wife", "дружина"));
        words.add(new Word("baby", "дитина"));
        words.add(new Word("child", "дитина(с)"));
        words.add(new Word("twin", "близнюк"));
        words.add(new Word("teenager", "підліток"));



        //Part of body
        words.add(new Word("head", "голова"));
        words.add(new Word("hair", "волосся"));
        words.add(new Word("forehead", "чоло"));
        words.add(new Word("face", "обличчя"));
        words.add(new Word("eyebrow", "брова"));
        words.add(new Word("eye", "око"));
        words.add(new Word("nose", "ніс"));
        words.add(new Word("cheek", "щока"));
        words.add(new Word("lip", "губа"));
        words.add(new Word("mouth", "рот"));
        words.add(new Word("tooth", "зуб"));
        words.add(new Word("chin", "підборіддя"));
        words.add(new Word("neck", "шия"));
        words.add(new Word("shoulder", "плече"));
        words.add(new Word("chest", "грудна клітка"));
        words.add(new Word("back", "спина"));
        words.add(new Word("stomach", "шлунок"));
        words.add(new Word("waist", "талія"));
        words.add(new Word("hip", "бедро"));
        words.add(new Word("skin", "шкіра"));
        words.add(new Word("thigh", "стегно"));
        words.add(new Word("arm", "рука"));
        words.add(new Word("elbow", "лікоть"));
        words.add(new Word("nail", "ніготь"));
        words.add(new Word("hand", "рука(кість руки)"));
        words.add(new Word("finger", "палець"));
        words.add(new Word("wrist", "зап*ястя"));
        words.add(new Word("leg", "нога"));
        words.add(new Word("knee", "коліно"));
        words.add(new Word("foot", "стопа"));
        words.add(new Word("ankle", "щиколотка"));
        words.add(new Word("heel", "п*ята"));
        words.add(new Word("toe", "палець ного"));
        words.add(new Word("brain", "мозок"));
        words.add(new Word("blood", "кров"));
        words.add(new Word("hear", "серце"));
        words.add(new Word("ear", "вухо"));



        //Describe people's appearance
        words.add(new Word("beautiful", "гарний"));
        words.add(new Word("good-looking", "гарний(g)"));
        words.add(new Word("handsome", "гарний(про чоловіка)"));
        words.add(new Word("pretty", "гарна(про жінку)"));
        words.add(new Word("attractive", "приваблива"));
        words.add(new Word("ugly", "потворний"));
        words.add(new Word("old", "старий"));
        words.add(new Word("elder", "старший"));
        words.add(new Word("middle-aged", "середнього віку"));
        words.add(new Word("young", "молодий"));
        words.add(new Word("tall", "високий"));
        words.add(new Word("short", "низький, короткий"));
        words.add(new Word("slim", "стрункий"));
        words.add(new Word("fat", "жирний"));
        words.add(new Word("overweight", "з надлишковою вагою"));
        words.add(new Word("plump", "пухкий"));
        words.add(new Word("medium height", "середнього росту"));
        words.add(new Word("muscular", "мускулистий"));
        words.add(new Word("fit", "в хорошій фізичній формі"));
        words.add(new Word("straight", "прямий"));
        words.add(new Word("wavy", "хвилястий"));
        words.add(new Word("curly", "кучерявий"));
        words.add(new Word("fair", "світлий"));
        words.add(new Word("dark", "темний"));
        words.add(new Word("long", "довгий"));
        words.add(new Word("pale", "блідий"));
        words.add(new Word("beard", "борода"));
        words.add(new Word("moustache", "вуса"));
        words.add(new Word("scar", "шрам"));
        words.add(new Word("mole", "родинка"));
        words.add(new Word("freckle", "веснушка"));
        words.add(new Word("wrinkle", "зморшка"));



        //Clothes
        words.add(new Word("belt", "ремінь"));
        words.add(new Word("blouse", "блузка"));
        words.add(new Word("bow-tie", "метелик-краватка"));
        words.add(new Word("coat", "пальто"));
        words.add(new Word("cap", "кепка"));
        words.add(new Word("dress", "плаття"));
        words.add(new Word("fur-coat", "шуба"));
        words.add(new Word("hat", "капелюх, шапка"));
        words.add(new Word("jeans", "джинси"));
        words.add(new Word("jacket", "куртка, піджак"));
        words.add(new Word("pyjamas", "піжама"));
        words.add(new Word("shirt", "сорочка"));
        words.add(new Word("suit", "костюм"));
        words.add(new Word("sweater", "светер"));
        words.add(new Word("skirt", "сорочка"));
        words.add(new Word("socks", "шкарпетка"));
        words.add(new Word("scarf", "шарф"));
        words.add(new Word("shorts", "шорти"));
        words.add(new Word("trousers", "штани"));
        words.add(new Word("t-shirt", "футболка"));
        words.add(new Word("tights", "колготи"));
        words.add(new Word("tie", "краватка"));
        words.add(new Word("underwear", "нижня білизна"));
        words.add(new Word("vest", "майка"));
        words.add(new Word("waistcoat", "жилетка"));
        words.add(new Word("pocket", "кишеня"));
        words.add(new Word("button", "гудзик"));
        words.add(new Word("collar", "комір"));
        words.add(new Word("sleeve", "рукав"));
        words.add(new Word("zipper", "блискавка"));
        words.add(new Word("jumper", "джемпер"));
        words.add(new Word("gloves", "рукавиці"));
        words.add(new Word("bag", "сумка"));
        words.add(new Word("hoodie", "товстовка з капішоном"));
        words.add(new Word("bathrobe", "халат"));
        words.add(new Word("strip", "смужка"));



        //Jewelry
        words.add(new Word("jewelry", "прикраси"));
        words.add(new Word("bracelet", "браслет"));
        words.add(new Word("chain", "ланцюжок"));
        words.add(new Word("earrings", "кульчики"));
        words.add(new Word("necklace", "намисто"));
        words.add(new Word("pendant", "кулончик"));
        words.add(new Word("ring", "обручка"));



        //Footwear
        words.add(new Word("footwear", "взуття"));
        words.add(new Word("shoes", "туфлі"));
        words.add(new Word("trainers", "кросівки"));
        words.add(new Word("gumshoes", "кеди"));
        words.add(new Word("sandals", "босоніжки"));
        words.add(new Word("slippers", "тапочки"));
        words.add(new Word("flats", "балетки"));
        words.add(new Word("boots", "чоботи"));
        words.add(new Word("flip-flops", "в*єтнамки"));
        words.add(new Word("high-heeled shoes", "туфлі на високих підборах"));



        //Patterns, material, colour
        words.add(new Word("stripped", "смугастий"));
        words.add(new Word("checked", "клітчастий"));
        words.add(new Word("floral", "квітчастий"));
        words.add(new Word("polka-dot", "в горошок"));
        words.add(new Word("leather", "шкіряний"));
        words.add(new Word("cotton", "бавовна, бавовняний"));
        words.add(new Word("suede", "замша, замшевий"));
        words.add(new Word("woolen", "вовняний"));
        words.add(new Word("silk", "шовк, шовковий"));
        words.add(new Word("knitted", "в*язаний"));
        words.add(new Word("dark", "темний"));
        words.add(new Word("light", "світлий, легкий"));
        words.add(new Word("black", "чорний"));
        words.add(new Word("brown", "коричневий"));
        words.add(new Word("grey", "сірий"));
        words.add(new Word("purple", "фіолетовий"));
        words.add(new Word("blue", "синій"));
        words.add(new Word("green", "зелений"));
        words.add(new Word("yellow", "жовтий"));
        words.add(new Word("orange", "оранжевий"));
        words.add(new Word("red", "червоний"));
        words.add(new Word("while", "білий"));
        words.add(new Word("silver", "срібний"));
        words.add(new Word("gold", "золотий"));
        words.add(new Word("wool", "вовна"));



        //Chapter 2
        //Homes and buildings. Arround the home.
        words.add(new Word("flat", "квартира"));
        words.add(new Word("detached house", "особняк"));
        words.add(new Word("balcony", "балкон"));
        words.add(new Word("bedroom", "спальня"));
        words.add(new Word("bathroom", "ванна"));
        words.add(new Word("living room", "вітальня"));
        words.add(new Word("kitchen", "кухня"));
        words.add(new Word("study", "кабінет"));
        words.add(new Word("garage", "гараж"));
        words.add(new Word("basement", "підвал"));
        words.add(new Word("attic", "горище"));
        words.add(new Word("roof", "дах"));
        words.add(new Word("spacious", "просторий"));
        words.add(new Word("cosy", "затишний"));
        words.add(new Word("dusty", "пидьний"));
        words.add(new Word("modern", "сучасний"));
        words.add(new Word("luxurious", "розкішний"));
        words.add(new Word("bookcase", "книжкова шафа"));
        words.add(new Word("shelf", "полиця"));
        words.add(new Word("TV set", "телевізор"));
        words.add(new Word("armchair", "м*яке крісло"));
        words.add(new Word("sofa", "диван"));
        words.add(new Word("carpet", "килим"));
        words.add(new Word("coffee table", "журнальний столик"));
        words.add(new Word("curtains", "штори"));
        words.add(new Word("remote control", "пульт"));
        words.add(new Word("window", "вікто"));
        words.add(new Word("fridge", "холодильний"));
        words.add(new Word("freezer", "морозильна камера"));
        words.add(new Word("bin", "смітник"));
        words.add(new Word("microwave", "мікрохвильова піч"));
        words.add(new Word("kettle", "чайник"));
        words.add(new Word("teapot", "заварничок"));
        words.add(new Word("floor", "підлога, поверх"));
        words.add(new Word("hall", "передпокій, хол"));
        words.add(new Word("corridor", "коридор"));
        words.add(new Word("dining room", "кімната зі столом, гостина"));
        words.add(new Word("stairs", "сходи"));
        words.add(new Word("cupboard", "кухона шафа"));
        words.add(new Word("dishwasher", "посудомийна машина"));
        words.add(new Word("worktop", "робоча поверхня"));
        words.add(new Word("tap", "кран"));
        words.add(new Word("sink", "раковина"));
        words.add(new Word("cooker", "плита"));
        words.add(new Word("oven", "духовка"));
        words.add(new Word("washing-up liquid", "рідина для миття посуду"));
        words.add(new Word("saucepan", "каструля"));
        words.add(new Word("coffee maker", "кавоварка"));
        words.add(new Word("flying pan", "сковорода"));
        words.add(new Word("cup", "кружка"));
        words.add(new Word("bowl", "глибока миска"));
        words.add(new Word("plate", "тарілка"));
        words.add(new Word("fork", "виделка"));
        words.add(new Word("knife", "ніж"));
        words.add(new Word("spoon", "ложка"));
        words.add(new Word("mug", "горня"));
        words.add(new Word("glass", "стакан"));
        words.add(new Word("bed", "ліжко"));
        words.add(new Word("bedside lamp", "нічник"));
        words.add(new Word("chest of drawers", "комод"));
        words.add(new Word("alarm clock", "будильник"));
        words.add(new Word("bedside table", "нічний столик"));
        words.add(new Word("wardrobe", "гардероб"));
        words.add(new Word("dressing table", "туалетний столик"));
        words.add(new Word("mirror", "дзеркало"));
        words.add(new Word("shower", "душ"));
        words.add(new Word("soap", "мило"));
        words.add(new Word("shampoo", "шампунь"));
        words.add(new Word("toothpaste", "зубна паста"));
        words.add(new Word("toothbrush", "зубна щітка"));
        words.add(new Word("washbasin", "умивальник"));
        words.add(new Word("towel", "рушник"));



        //Preposition of place
        words.add(new Word("on", "на"));
        words.add(new Word("under", "під"));
        words.add(new Word("bellow", "нижче"));
        words.add(new Word("over", "над"));
        words.add(new Word("above", "вище"));
        words.add(new Word("in", "у, в"));
        words.add(new Word("behind", "позаду"));
        words.add(new Word("in front of", "перед чимось"));
        words.add(new Word("between", "між"));
        words.add(new Word("into", "в"));
        words.add(new Word("out of", "за"));
        words.add(new Word("up", "в горі"));
        words.add(new Word("through", "через(наскрізь)"));
        words.add(new Word("across", "через(на той бік, впоперек)"));
        words.add(new Word("beside", "поруч, біля"));
        words.add(new Word("next to", "поруч з"));
        words.add(new Word("around", "навколо"));



        //In the town. Giving direction
        words.add(new Word("picturesque", "мальовничий"));
        words.add(new Word("lively", "жвавий"));
        words.add(new Word("bustling", "метушливий"));
        words.add(new Word("noisy", "шумний"));
        words.add(new Word("polluted", "забруднений"));
        words.add(new Word("stressful", "напружений"));
        words.add(new Word("crowded", "переповнений, людний"));
        words.add(new Word("dangerous", "небезпечний"));
        words.add(new Word("calm", "спокійний"));
        words.add(new Word("airport", "айропорт"));
        words.add(new Word("ATM", "банкомат"));
        words.add(new Word("bridge", "міст"));
        words.add(new Word("bus stop", "автобусна зупинка"));
        words.add(new Word("cafe", "кафе"));
        words.add(new Word("car park", "автомобільна парковка"));
        words.add(new Word("city centre", "центр міста"));
        words.add(new Word("church", "церква"));
        words.add(new Word("corner", "кут"));
        words.add(new Word("countryside", "заміська місцевість"));
        words.add(new Word("crossroads", "перехрестя"));
        words.add(new Word("forest", "ліс"));
        words.add(new Word("hotel", "готель"));
        words.add(new Word("lake", "озеро"));
        words.add(new Word("market", "ринок"));
        words.add(new Word("monument", "пам*ятник"));
        words.add(new Word("mountain", "гора"));
        words.add(new Word("park", "парк"));
        words.add(new Word("railway station", "залізнична станція"));
        words.add(new Word("petrol station", "заправка"));
        words.add(new Word("restaurant", "ресторан"));
        words.add(new Word("river", "річка"));
        words.add(new Word("sea", "море"));
        words.add(new Word("shopping centre", "торгівельний центр"));
        words.add(new Word("square", "площа"));
        words.add(new Word("street", "вулиця"));
        words.add(new Word("town", "місто"));
        words.add(new Word("town hall", "міська рада"));
        words.add(new Word("zoo", "зоопарк"));
        words.add(new Word("go straight on", "йти прямо по"));
        words.add(new Word("go along", "йти вздовж"));
        words.add(new Word("turn left", "повернути ліворуч"));
        words.add(new Word("turn right", "повернути праворуч"));



        //Daily life. Everyday verbs.
        words.add(new Word("byu", "купувати"));
        words.add(new Word("brush teeth", "чистити зуби"));
        words.add(new Word("break", "ламати"));
        words.add(new Word("comb", "розчісувати"));
        words.add(new Word("cook", "готувати"));
        words.add(new Word("come", "приходити"));
        words.add(new Word("clean", "чистити"));
        words.add(new Word("choose", "вибирати"));
        words.add(new Word("drink", "пити"));
        words.add(new Word("do", "робити"));
        words.add(new Word("do housework", "робити домашню роботу"));
        words.add(new Word("do homework", "робити домашнє завдання"));
        words.add(new Word("eat", "їсти"));
        words.add(new Word("forget", "забувати"));
        words.add(new Word("fall asleep", "засинати"));
        words.add(new Word("get up", "прокидатися"));
        words.add(new Word("get dressed", "одягатися"));
        words.add(new Word("go to bed", "йти спати"));
        words.add(new Word("have a shower", "приймати душ"));
        words.add(new Word("have a bath", "приймати вану"));
        words.add(new Word("have breakfast", "снідати"));
        words.add(new Word("hear", "чути"));
        words.add(new Word("go for a walk", "йти на прогулянку"));
        words.add(new Word("live", "жити"));
        words.add(new Word("leave", "залишати"));
        words.add(new Word("learn", "вчитися"));
        words.add(new Word("make", "робити"));
        words.add(new Word("put on clothes", "одягатися"));
        words.add(new Word("relax", "відпочивати"));
        words.add(new Word("study", "навчатися"));
        words.add(new Word("speak", "говорити"));
        words.add(new Word("sell", "продавати"));
        words.add(new Word("sleep", "спати"));
        words.add(new Word("teach", "навчати"));
        words.add(new Word("wake up", "прокидатися"));
        words.add(new Word("work", "працювати"));
        words.add(new Word("watch TV", "дивитися телефізор"));
        words.add(new Word("write", "писати"));
        words.add(new Word("wash", "мити"));
        words.add(new Word("understand", "розуміти"));


        return words;
    }
}
