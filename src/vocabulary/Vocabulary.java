package vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) {

        List<Word> words = getWords();

        while (words.size() != 0) {
            Random ran = new Random();
            int index = ran.nextInt(words.size());
            Word word = words.get(index);

            if (word instanceof IrregularVerb) {

                checkVord(word, index, words);

            } else {

                checkVord(word, index, words);

            }

            System.out.println("List size: " + words.size());
        }

        System.out.println("LIST IS EMPTY");
    }

    public static void checkVord(IrregularVerb word, int index, List<Word> words) {
        System.out.println("==== IRREGULAR VERB ====");
        System.out.println(word.getT());

        Scanner in1 = new Scanner(System.in);
        String s1 = in1.nextLine();

        if (s1.equalsIgnoreCase(word.getW())) {
            System.out.println("true.");
        } else {
            System.out.println("false. " + word);
            return;
        }

        Scanner in2 = new Scanner(System.in);
        String s2 = in2.nextLine();

        if (s2.equalsIgnoreCase(word.getW2())) {
            System.out.println("true.");
        } else {
            System.out.println("false. " + word);
            return;
        }

        Scanner in3 = new Scanner(System.in);
        String s3 = in3.nextLine();

        if (s3.equalsIgnoreCase(word.getW3())) {
            System.out.println("true.");
            words.remove(index);
        } else {
            System.out.println("false. " + word);
        }
    }

    public static void checkVord(Word word, int index, List<Word> words) {
        System.out.println("==== WORD ====");
        System.out.println(word.getT());

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if (s.equalsIgnoreCase(word.getW())) {
            System.out.println("true");
            words.remove(index);
        } else {
            System.out.println("false. " + word);
        }
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



        //Chapter 3.
        //Work
        words.add(new Word("accountant", "бухгалтер"));
        words.add(new Word("architect", "архітектор"));
        words.add(new Word("baby-sitter", "няня"));
        words.add(new Word("cashier", "касир"));
        words.add(new Word("chef", "шеф-повар"));
        words.add(new Word("cook", "повар"));
        words.add(new Word("dentist", "стоматолог"));
        words.add(new Word("doctor", "лікар"));
        words.add(new Word("driver", "водій"));
        words.add(new Word("engineer", "індженер"));
        words.add(new Word("farmer", "фермер"));
        words.add(new Word("hairdresser", "перукар"));
        words.add(new Word("journalist", "журналіст"));
        words.add(new Word("judge", "суддя"));
        words.add(new Word("lawyer", "юрист"));
        words.add(new Word("librarian", "бібліотекар"));
        words.add(new Word("mechanic", "механік"));
        words.add(new Word("nurse", "медсестра"));
        words.add(new Word("policeman", "поліцейський"));
        words.add(new Word("politician", "політик"));
        words.add(new Word("secretary", "секретар"));
        words.add(new Word("shop assistant", "продавець"));
        words.add(new Word("teacher", "вчитель"));
        words.add(new Word("vet", "ветеринар"));
        words.add(new Word("waiter", "офіціант"));
        words.add(new Word("waitress", "офіціантка"));
        words.add(new Word("designer", "дизайнер"));
        words.add(new Word("electrician", "електрик"));
        words.add(new Word("fireman", "пожежник"));
        words.add(new Word("gardener", "садівник"));
        words.add(new Word("florist", "флорист"));
        words.add(new Word("lifeguard", "рятувальник на морі"));
        words.add(new Word("flight attendant", "борт провідник"));
        words.add(new Word("pilot", "пілот"));



        //Workplace and working conditions. The career ladder.
        words.add(new Word("duties", "обов*язки(d)"));
        words.add(new Word("responsibilities", "обов*язки(r)"));
        words.add(new Word("full-time job", "робота на повний робочий день"));
        words.add(new Word("part-time job", "робота на неповний робочий день"));
        words.add(new Word("nine-to-five job", "восьмо годиний робочий день"));
        words.add(new Word("flexi-time", "гнучкий графік роботи"));
        words.add(new Word("shift work", "робота по змінах"));
        words.add(new Word("salary", "зарплата"));
        words.add(new Word("income", "прибуток"));
        words.add(new Word("employer", "роботодавець"));
        words.add(new Word("employee", "працівник"));
        words.add(new Word("unemployed", "безробітній"));
        words.add(new Word("trainee", "стажер"));
        words.add(new Word("company", "компанія"));
        words.add(new Word("staff", "персонал"));
        words.add(new Word("colleagues", "колеги"));
        words.add(new Word("CV", "резюме"));
        words.add(new Word("vacation", "відпустка"));
        words.add(new Word("be responsible for", "бути відповідальним за"));
        words.add(new Word("work overtime", "працювати понаднормово"));
        words.add(new Word("apply for a job", "найматися на роботу"));
        words.add(new Word("employ", "наймати на роботу(e)"));
        words.add(new Word("hire", "наймати на роботу(h)"));
        words.add(new Word("fulfill", "виконувати(f)"));
        words.add(new Word("perform", "виконувати(p)"));
        words.add(new Word("earn", "заробляти"));
        words.add(new Word("receive", "отримувати"));
        words.add(new Word("promote", "підвищувати"));
        words.add(new Word("retire", "вийти на пенсію"));
        words.add(new Word("give up", "кидати, здаватися"));
        words.add(new Word("resign", "піти у відставку"));



        //Education
        words.add(new Word("kindergarten", "дитячий садок"));
        words.add(new Word("primary school", "початкова школа"));
        words.add(new Word("secondary school", "середня школа"));
        words.add(new Word("college", "коледж"));
        words.add(new Word("higher education", "вища освіта"));
        words.add(new Word("university", "університет"));
        words.add(new Word("faculty", "факультет"));
        words.add(new Word("department", "відділ"));
        words.add(new Word("term", "семест"));
        words.add(new Word("lecture", "лекція"));
        words.add(new Word("lesson", "урок"));
        words.add(new Word("subject", "предмет"));
        words.add(new Word("bachelor", "бакалавр"));
        words.add(new Word("master", "магістр"));
        words.add(new Word("degree", "ступінь"));
        words.add(new Word("lecturer", "лектор, викладач"));
        words.add(new Word("teacher", "вчитель"));
        words.add(new Word("certificate", "сертифікат"));
        words.add(new Word("diploma", "диплом"));
        words.add(new Word("scholarship", "стипендія(s)"));
        words.add(new Word("grant", "стипендія(g)"));
        words.add(new Word("assignment", "завдання"));
        words.add(new Word("mark", "оцінка"));
        words.add(new Word("point", "бал"));
        words.add(new Word("enter", "вступити"));
        words.add(new Word("enroll", "записатися"));
        words.add(new Word("attend", "відвідувати"));
        words.add(new Word("learn", "вивчати"));
        words.add(new Word("study", "навчатися"));
        words.add(new Word("teach", "навчати"));
        words.add(new Word("ask", "питати, просити"));
        words.add(new Word("answer", "відповідати"));
        words.add(new Word("cheat", "списувати"));
        words.add(new Word("graduate from", "завершити(про навчальний заклад)"));



        //Chapter 4.
        //Food and restaurants. Eating out
        words.add(new Word("meat", "м*ясо(продукт харчування)"));
        words.add(new Word("poultry", "птиця(продукт харчування)"));
        words.add(new Word("ham", "шинка"));
        words.add(new Word("pork", "свинина"));
        words.add(new Word("beef", "яловичина"));
        words.add(new Word("veal", "телятина"));
        words.add(new Word("meat balls", "фрикадельки"));
        words.add(new Word("chop", "відбивна"));
        words.add(new Word("cutlet", "котлета"));
        words.add(new Word("liver", "печінка"));
        words.add(new Word("turkey", "індичка"));
        words.add(new Word("duck", "качка"));
        words.add(new Word("broth", "бульйон"));
        words.add(new Word("bread", "хліб"));
        words.add(new Word("biscuit", "печенько"));
        words.add(new Word("cake", "торт"));
        words.add(new Word("dairy products", "молочні продукти"));
        words.add(new Word("sour cream", "сметана"));
        words.add(new Word("cheese", "сир"));
        words.add(new Word("milk", "молоко"));
        words.add(new Word("egg", "яйце"));
        words.add(new Word("butter", "масло"));
        words.add(new Word("yogurt", "йогурт"));
        words.add(new Word("cereal", "каша"));
        words.add(new Word("buckwheat", "гречка"));
        words.add(new Word("salt", "сіль"));
        words.add(new Word("vinegar", "оцет"));
        words.add(new Word("oil", "олія"));
        words.add(new Word("olive", "оливкова олія"));
        words.add(new Word("mustard", "гірчиця"));
        words.add(new Word("mayonnaise", "майонез"));
        words.add(new Word("rise", "рис"));
        words.add(new Word("flour", "мука"));
        words.add(new Word("herring", "оселедець"));
        words.add(new Word("shrimps", "креветки"));
        words.add(new Word("lobster", "лобстер"));
        words.add(new Word("salmon", "лосось"));
        words.add(new Word("sprats", "шпроти"));
        words.add(new Word("fried fish", "смажена риба"));
        words.add(new Word("raw fish", "сира риба"));
        words.add(new Word("smoked fish", "копчена риба"));
        words.add(new Word("stuffed fish", "фарширована риба"));
        words.add(new Word("caviar", "ікра"));
        words.add(new Word("vegetables", "овочі"));
        words.add(new Word("potato", "картопля"));
        words.add(new Word("tomato", "помідор"));
        words.add(new Word("cabbage", "капуста"));
        words.add(new Word("carrot", "морква"));
        words.add(new Word("cucumber", "огірок"));
        words.add(new Word("beet", "буряк"));
        words.add(new Word("onion", "цибуля"));
        words.add(new Word("radish", "редиска"));
        words.add(new Word("lettuce", "листя салату"));
        words.add(new Word("vegetable marrow", "кабачок"));
        words.add(new Word("egg-plant", "баклажан"));
        words.add(new Word("parsley", "петрушка"));
        words.add(new Word("pepper", "перець"));
        words.add(new Word("garlic", "часник"));
        words.add(new Word("fruit", "фрукт"));
        words.add(new Word("berry", "ягода"));
        words.add(new Word("apple", "яблуко"));
        words.add(new Word("apricot", "абрикос"));
        words.add(new Word("banana", "банан"));
        words.add(new Word("grapes", "виноград"));
        words.add(new Word("melon", "диня"));
        words.add(new Word("orange", "апельсин"));
        words.add(new Word("peach", "персик"));
        words.add(new Word("pear", "груша"));
        words.add(new Word("pineapple", "ананас"));
        words.add(new Word("strawberry", "полуниця"));
        words.add(new Word("raspberry", "малина"));
        words.add(new Word("watermelon", "кавун"));
        words.add(new Word("drink", "напій"));
        words.add(new Word("wine", "вино"));
        words.add(new Word("sweet wine", "солодке вино"));
        words.add(new Word("dry wine", "сухе вино"));
        words.add(new Word("soft drink", "безалкогольний напій"));
        words.add(new Word("stewed fruit", "копот"));
        words.add(new Word("boil", "кип*ятити"));
        words.add(new Word("fry", "смажити на сковорі"));
        words.add(new Word("grill", "смажити на грилі"));
        words.add(new Word("roast", "запікати в духовці"));
        words.add(new Word("bake", "випікати"));
        words.add(new Word("heat", "нагрівати"));
        words.add(new Word("cut", "різати"));
        words.add(new Word("spread", "намащувати"));
        words.add(new Word("grate", "терти"));
        words.add(new Word("chop", "різати кубиками"));
        words.add(new Word("slice", "різати скибками"));



        //Shops and shopping
        words.add(new Word("bookshop", "книжковий магазин"));
        words.add(new Word("boutique", "бутік"));
        words.add(new Word("department store", "універмаг"));
        words.add(new Word("shoe shop", "взуттевий магазин"));
        words.add(new Word("sports shop", "спортивний магазин"));
        words.add(new Word("supermarket", "супермаркет"));
        words.add(new Word("toyshop", "іграшковий магазин"));
        words.add(new Word("cash-desk", "каса"));
        words.add(new Word("cashier", "касир"));
        words.add(new Word("fitting room", "примірочна"));
        words.add(new Word("goods", "товар"));
        words.add(new Word("product", "продукт"));
        words.add(new Word("receipt", "товарний чек"));
        words.add(new Word("affort", "дозволити собі(фінансово)"));
        words.add(new Word("buy", "купувати"));
        words.add(new Word("borrow", "позичати"));
        words.add(new Word("charge", "сплачувати за"));
        words.add(new Word("cost", "коштувати"));
        words.add(new Word("do shopping", "робити покупки"));
        words.add(new Word("exchange", "обмінювати"));
        words.add(new Word("fit", "підходити(по розміру)"));
        words.add(new Word("go shopping", "йти за покупками"));
        words.add(new Word("land", "позичати"));
        words.add(new Word("match", "підходити"));
        words.add(new Word("owe", "бути винним"));
        words.add(new Word("pay", "платити"));
        words.add(new Word("purchase", "купувати"));
        words.add(new Word("sell", "продавати"));
        words.add(new Word("suit", "личити"));
        words.add(new Word("try on", "приміряти"));



        //I don't how it names
        words.add(new Word("who", "хто?"));
        words.add(new Word("whose", "чий?, чия?, чиє?"));
        words.add(new Word("what", "що?, який?"));
        words.add(new Word("which", "котрий?"));
        words.add(new Word("where", "де?"));
        words.add(new Word("when", "коли?"));
        words.add(new Word("how long", "як довго?"));
        words.add(new Word("how often", "як часто?"));
        words.add(new Word("why", "чому?"));
        words.add(new Word("how much", "скільки(незлічувані)?"));
        words.add(new Word("how many", "скільки(злічувані)?"));



        //Holidays and travelling
        words.add(new Word("airport", "аеропорт"));
        words.add(new Word("arrival", "прибуття"));
        words.add(new Word("arrive", "приїжджати"));
        words.add(new Word("bed and breakfast", "лише сніданок включений у вартість"));
        words.add(new Word("backpack", "рюкзак"));
        words.add(new Word("bicycle", "велосипед"));
        words.add(new Word("boarding pass", "посадковий талон"));
        words.add(new Word("board the plane", "сідати на борт літака"));
        words.add(new Word("book", "резервувати(b)"));
        words.add(new Word("bus", "автобус"));
        words.add(new Word("bus fare", "плата за проїзд у автобусі"));
        words.add(new Word("train fare", "плата за проїзд у поїзді"));
        words.add(new Word("car", "машина"));
        words.add(new Word("carriage", "вагон"));
        words.add(new Word("check-in", "реєстрація"));
        words.add(new Word("confirm", "підтверджувати"));
        words.add(new Word("customs", "митниця"));
        words.add(new Word("depart", "від*їжджати"));
        words.add(new Word("departure", "виїзд"));
        words.add(new Word("departure lounge", "зал відпочинку"));
        words.add(new Word("destination", "місце призначення"));
        words.add(new Word("double room", "двомісна кімната"));
        words.add(new Word("facilities", "зручності"));
        words.add(new Word("flight", "рейс"));
        words.add(new Word("fly", "літати"));
        words.add(new Word("full board", "сніданок, обід, вечеря включенні у вартість"));
        words.add(new Word("half board", "сніданок і вечеря включенні у вартість"));
        words.add(new Word("hotel", "готель"));
        words.add(new Word("journey", "подорож(j)"));
        words.add(new Word("lorry", "вантажівка"));
        words.add(new Word("luggage", "багаж"));
        words.add(new Word("passport control", "паспортний контроль"));
        words.add(new Word("plane", "літак"));
        words.add(new Word("reserve", "зарезевувати(r)"));
        words.add(new Word("reservation", "бронювання"));
        words.add(new Word("seaside holiday", "канікули на морі"));
        words.add(new Word("ship", "корабель"));
        words.add(new Word("single room", "одномісна кімната"));
        words.add(new Word("suitcase", "валіза"));
        words.add(new Word("tax", "податок"));
        words.add(new Word("taxi", "таксі"));
        words.add(new Word("tour", "тур"));
        words.add(new Word("train", "поїзд"));
        words.add(new Word("tram", "трамвай"));
        words.add(new Word("traveller", "подорожуючий, мандрівник"));
        words.add(new Word("trip", "подорож(t)"));
        words.add(new Word("visa", "віза"));



        //Chapter 5.
        //Trains of character
        words.add(new Word("ambitious", "амбіційний"));
        words.add(new Word("angry", "злий"));
        words.add(new Word("arrogant", "зарозумілий"));
        words.add(new Word("aggressive", "агресивний"));
        words.add(new Word("boring", "нудний"));
        words.add(new Word("brave", "сміливий"));
        words.add(new Word("calm", "спокійний"));
        words.add(new Word("carefree", "безтурботний"));
        words.add(new Word("cheerful", "веселий"));
        words.add(new Word("clever", "розумний"));
        words.add(new Word("creative", "творчий"));
        words.add(new Word("dishonest", "лицемірний"));
        words.add(new Word("frank", "відвертий"));
        words.add(new Word("friendly", "дружелюбний"));
        words.add(new Word("funny", "смішний"));
        words.add(new Word("generous", "щедрий"));
        words.add(new Word("greedy", "скупий, жадібний"));
        words.add(new Word("happy", "щасливий"));
        words.add(new Word("honest", "чесний"));
        words.add(new Word("impatient", "нетерплячий"));
        words.add(new Word("kind", "добрий"));
        words.add(new Word("lazy", "лінивий"));
        words.add(new Word("livery", "жвавий"));
        words.add(new Word("loyal", "відданий"));
        words.add(new Word("modest", "скромний"));
        words.add(new Word("patient", "терпеливий"));
        words.add(new Word("punctual", "пунктуальний"));
        words.add(new Word("realistic", "реалістичний"));
        words.add(new Word("reliable", "надійний"));
        words.add(new Word("responsible", "відповідальний"));
        words.add(new Word("self-confident", "самовпевнений"));
        words.add(new Word("sensible", "розсудливий"));
        words.add(new Word("sensitive", "чуйний"));
        words.add(new Word("spy", "сором*язливий"));
        words.add(new Word("stubborn", "впертий"));
        words.add(new Word("unpredictable", "непередбачуваний"));
        words.add(new Word("timid", "боягуз"));
        words.add(new Word("well-balanced", "врівноважений"));



        //Relationships
        words.add(new Word("acquaintance", "знайомий"));
        words.add(new Word("boyfriend", "хлопець"));
        words.add(new Word("bride", "наречена(на весіллі)"));
        words.add(new Word("close", "близький друг"));
        words.add(new Word("distant relative", "далекий родич"));
        words.add(new Word("girlfriend", "дівчина"));
        words.add(new Word("groom", "наречений(на весіллі)"));
        words.add(new Word("marriage", "шлюб, одруження"));
        words.add(new Word("spouse", "чоловік або дружина"));
        words.add(new Word("wedding", "вессіля"));
        words.add(new Word("annoy", "нервувати"));
        words.add(new Word("apologize", "вибачатися"));
        words.add(new Word("argue", "сперечатися, сваритися"));
        words.add(new Word("behave", "поводитися"));
        words.add(new Word("communicate", "спілкуватися"));
        words.add(new Word("criticize", "критикувати"));
        words.add(new Word("cheat", "зраджувати"));
        words.add(new Word("date", "зустрічатися(побачення)"));
        words.add(new Word("divorce", "розлучитися"));
        words.add(new Word("fancy", "подобатись"));
        words.add(new Word("force", "змушувати"));
        words.add(new Word("get married", "одружитися"));
        words.add(new Word("get acquainted", "познайомитись"));
        words.add(new Word("get out with someone", "зустрічатися з уимось"));
        words.add(new Word("embarrass", "бентежити"));
        words.add(new Word("offend", "ображати"));
        words.add(new Word("pretend", "прикидатися"));
        words.add(new Word("propose", "зробити пропозицію"));
        words.add(new Word("regret", "шкодувати"));
        words.add(new Word("separate", "розійтись, розлучитись"));
        words.add(new Word("share", "ділитися"));
        words.add(new Word("support", "підтримувати"));
        words.add(new Word("get on well", "ладнати"));
        words.add(new Word("trust", "довіряти"));



        //Feeling and emotions
        words.add(new Word("aggressive", "агресивний"));
        words.add(new Word("amazed", "вражений, здивований(a)"));
        words.add(new Word("annoyed", "роздратований"));
        words.add(new Word("anxious", "схвильований(a)"));
        words.add(new Word("attentive", "уважний"));
        words.add(new Word("bored", "знуджений"));
        words.add(new Word("charming", "чарівний"));
        words.add(new Word("confused", "спантеличений"));
        words.add(new Word("curious", "цікавий"));
        words.add(new Word("depressed", "пригнічений"));
        words.add(new Word("excited", "схвильований(e)"));
        words.add(new Word("exhausted", "виснажений"));
        words.add(new Word("focused", "зосереджений"));
        words.add(new Word("furious", "лютий, розлючений"));
        words.add(new Word("gloomy", "похмурий"));
        words.add(new Word("grateful", "вдячний"));
        words.add(new Word("interested", "зацікавлений"));
        words.add(new Word("jealous", "ревнивий, заздрісний"));
        words.add(new Word("miserable", "жалюгідний, нещасний"));
        words.add(new Word("motivated", "мотивований"));
        words.add(new Word("sad", "сумний"));
        words.add(new Word("scared", "наляканий"));
        words.add(new Word("surprised", "здивований(s)"));
        words.add(new Word("tired", "втомлений"));
        words.add(new Word("upset", "засмучений"));
        words.add(new Word("worried", "стурбований"));






        //Irregular verbs
        /////////////////
        words.add(new IrregularVerb("be", "was, were", "been", "бути"));
        words.add(new IrregularVerb("bear", "bore", "born", "нести, народжувати"));
        words.add(new IrregularVerb("become", "became", "become", "ставати кимось, чимось"));
        words.add(new IrregularVerb("begin", "began", "begun", "починати(ся)"));
        words.add(new IrregularVerb("bite", "bit", "bit", "кусати"));
        words.add(new IrregularVerb("blow", "blew", "blown", "дути"));
        words.add(new IrregularVerb("break", "broke", "broken", "ламати"));
        words.add(new IrregularVerb("bring", "brought", "brought", "приносити"));
        words.add(new IrregularVerb("build", "built", "built", "будувати"));
        words.add(new IrregularVerb("burn", "burnt", "burnt", "горіти, палати"));
        words.add(new IrregularVerb("buy", "bought", "bought", "купувати"));
        words.add(new IrregularVerb("catch", "caught", "caught", "ловити"));
        words.add(new IrregularVerb("choose", "chose", "chosen", "вибирати"));
        words.add(new IrregularVerb("come", "came", "come", "приходити"));
        words.add(new IrregularVerb("cost", "cost", "cost", "коштувати"));
        words.add(new IrregularVerb("cut", "cut", "cut", "різати"));
        words.add(new IrregularVerb("do", "did", "done", "робити, виконувати"));
        words.add(new IrregularVerb("draw", "drew", "drawn", "малювати"));
        words.add(new IrregularVerb("dream", "dreamt", "dreamt", "мріяти, снитися"));
        words.add(new IrregularVerb("drink", "drank", "drunk", "пити"));
        words.add(new IrregularVerb("drive", "drove", "driven", "керувати, водити"));
        words.add(new IrregularVerb("eat", "ate", "eaten", "їсти"));
        words.add(new IrregularVerb("fall", "fell", "fallen", "падати"));
        words.add(new IrregularVerb("feed", "fed", "fed", "годувати"));
        words.add(new IrregularVerb("feel", "felt", "felt", "почувати(себе)"));
        words.add(new IrregularVerb("fight", "fought", "fought", "битися, боротися"));
        words.add(new IrregularVerb("forget", "forgot", "forgotten", "забувати"));

        words.add(new IrregularVerb("get", "got", "got", "отримувати"));
        words.add(new IrregularVerb("give", "gave", "given", "давати"));
        words.add(new IrregularVerb("go", "went", "gone", "іти, їхати"));
        words.add(new IrregularVerb("grow", "grew", "grown", "виростити"));
        words.add(new IrregularVerb("hang", "hung", "hung", "вішати, висіти"));
        words.add(new IrregularVerb("have", "had", "had", "мати"));
        words.add(new IrregularVerb("hear", "heard", "heard", "чути"));
        words.add(new IrregularVerb("hide", "hid", "hidden", "ховатися"));
        words.add(new IrregularVerb("know", "knew", "known", "знати"));
        words.add(new IrregularVerb("lead", "led", "let", "вести, призводити"));
        words.add(new IrregularVerb("learn", "learnt", "learnt", "вчити(ся)"));
        words.add(new IrregularVerb("leave", "left", "left", "залишити, покидати"));
        words.add(new IrregularVerb("lend", "lent", "lent", "позичати"));
        words.add(new IrregularVerb("let", "let", "let", "дозволяти"));
        words.add(new IrregularVerb("light", "lit", "lit", "світити"));
        words.add(new IrregularVerb("lose", "lost", "lost", "втрачати"));
        words.add(new IrregularVerb("mean", "meant", "meant", "означати"));
        words.add(new IrregularVerb("meet", "met", "met", "зустрічати, знайомитися"));
        words.add(new IrregularVerb("put", "put", "put", "класти"));
        words.add(new IrregularVerb("read", "read", "read", "читати"));
        words.add(new IrregularVerb("ride", "rode", "ridden", "кататися"));
        words.add(new IrregularVerb("rise", "rose", "risen", "підніматися"));
        words.add(new IrregularVerb("run", "ran", "run", "бігти"));
        words.add(new IrregularVerb("say", "said", "said", "сказати"));
        words.add(new IrregularVerb("see", "saw", "seen", "бачити"));
        words.add(new IrregularVerb("sell", "sold", "sold", "продавати"));
        words.add(new IrregularVerb("send", "sent", "sent", "надсилати"));
        words.add(new IrregularVerb("set", "set", "set", "налаштовувати, встановлювати"));
        words.add(new IrregularVerb("sit", "sat", "sat", "сидіти"));

        words.add(new IrregularVerb("sleep", "slept", "slept", "спати"));
        words.add(new IrregularVerb("speak", "spoke", "spoken", "говорити, розмовляти"));
        words.add(new IrregularVerb("spend", "spent", "spent", "тратити, проводити(час)"));
        words.add(new IrregularVerb("stand", "stood", "stood", "стояти"));
        words.add(new IrregularVerb("steal", "stole", "stolen", "красти"));
        words.add(new IrregularVerb("swim", "swam", "swum", "плавати"));
        words.add(new IrregularVerb("take", "took", "taken", "брати"));
        words.add(new IrregularVerb("teach", "taught", "taught", "навчати"));
        words.add(new IrregularVerb("tell", "told", "told", "розповідати"));
        words.add(new IrregularVerb("think", "thought", "thought", "думати"));
        words.add(new IrregularVerb("understand", "understood", "understood", "розуміти"));
        words.add(new IrregularVerb("wake", "woke", "woken", "прокидатися"));
        words.add(new IrregularVerb("wear", "wore", "worn", "носити, одягати"));
        words.add(new IrregularVerb("win", "won", "won", "перемагати, вигравати"));
        words.add(new IrregularVerb("write", "wrote", "written", "писати"));
        words.add(new IrregularVerb("hit", "hit", "hit", "вдарити"));
        words.add(new IrregularVerb("keep", "kept", "kept", "зберігати, тримати"));
        words.add(new IrregularVerb("fly", "flew", "flown", "літати"));
        words.add(new IrregularVerb("find", "found", "found", "знайти"));
        words.add(new IrregularVerb("hurt", "hurt", "hurt", "причинити біль"));
        words.add(new IrregularVerb("make", "made", "made", "зробити"));
        words.add(new IrregularVerb("shoot", "shot", "shot", "стріляти"));
        words.add(new IrregularVerb("throw", "threw", "thrown", "кидати"));



        return words;
    }
}
