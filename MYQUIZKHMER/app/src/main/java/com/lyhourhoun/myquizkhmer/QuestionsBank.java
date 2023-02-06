package com.lyhourhoun.myquizkhmer;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> ប្រវត្តិវិទ្យាQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // put Question option and Answer

        final QuestionsList question1 = new QuestionsList("តើសម្តេចព្រះបាទ នរោត្ដម សីហនុឈប់ទទួលយក ជំនួយយោធាពីសហរដ្ឋអាមេរិក នៅឆ្នាំណា?",
                "A.ឆ្នាំ ១៩៦៣","B.ឆ្នាំ ១៩៦៦","C.ឆ្នាំ ១៩៦៤", "D.ឆ្នាំ ១៩៦៥",
                "A.ឆ្នាំ ១៩៦៣", "");
        final QuestionsList question2 = new QuestionsList("តើក្រោយរដ្ឋប្រហារសម្ដេចសីហនុ តើលោក លន់ ណុលត្រូវបានគេតែងតាំងជាអ្វី?",
                "A.នាយករដ្ឋមន្ត្រី","B.ប្រធានាធិបតី","C.ជាប្រធានរដ្ឋសភា", "D.ប្រធានព្រឹទ្ធសភា",
                "A.នាយករដ្ឋមន្ត្រី", "");
        final QuestionsList question3 = new QuestionsList("តើព្រះបាទជ័យវរ័្មនទី៧ បានសោយរាជ្យនៅព្រះជន្មប៉ុន្មាន?",
                "A.៣៦ព្រះវស្សា","B.១៦ព្រះវស្សា","C.២៦ព្រះវស្សា", "D.៥៦ព្រះវស្សា",
                "D.៥៦ព្រះវស្សា", "");
        final QuestionsList question4 = new QuestionsList("តើព្រះករុណាព្រះបាទសម្តេចព្រះ នរោត្តម សីហនុ សោយទីវង្គតក្នុងព្រះជន្មាយុ ប៉ុន្មានព្រះវស្សា??",
                "A.៩២ ព្រះវស្សា","B.៩០ ព្រះវស្សា","C.៩៣ ព្រះវស្សា", "D.៩១ ព្រះវស្សា",
                "B.៩០ ព្រះវស្សា", "");
        final QuestionsList question5 = new QuestionsList("តើនៅកម្ពុជា តើចលនាតស៊ូខ្មែរឥស្សរៈត្រូវបានដឹកនាំ ដោយនរណា?",
                "A.បក្សកុំមុយនីស្តឥណ្ឌូចិន","B.បារាំង","C.ថៃ", "D.យួន",
                "A.បក្សកុំមុយនីស្តឥណ្ឌូចិន", "");
        final QuestionsList question6 = new QuestionsList("តើព្រះបាទនរោត្តមសីហនុ បានចូលកាន់តំណែងជា ប្រមុខរដ្ឋនៅថ្ងៃណា ខែណា ឆ្នាំណា ?",
                "A.២២ មិថុនា ១៩៦០","B.២០ មិថុនា ១៩៦០","C.២៣ មិថុនា ១៩៦០", "D.២១ មិថុនា ១៩៦០",
                "B.២០ មិថុនា ១៩៦០", "");
        final QuestionsList question7 = new QuestionsList("តើព្រះបាទអង្គឌួង ជាបុត្ររបស់ព្រះរាជាអង្គណា ?",
                "A.ព្រះបាទ អង្គអេង","B.ព្រះបាទសុរាម្រិត","C.ព្រះបាទសីហនុ", "D.ព្រះបាទស៊ីសុវត្តិ",
                "A.ព្រះបាទ អង្គអេង", "");
        final QuestionsList question8 = new QuestionsList("តើមេដឹកនាំខ្មែរឥស្សរៈ ដែលបានចុះចូលជាមួយ នឹង រដ្ឋាភិបាលវិញនៅថ្ងៃណា ខែណា ឆ្នាំណា ?",
                "A.២០ កុម្ភៈ ១៨៥៥","B.២០ កុម្ភៈ ១៨៥៦","C.២០ កុម្ភៈ ១៨៥៤", "D.២០ កុម្ភៈ ១៨៥៧",
                "C.២០ កុម្ភៈ ១៨៥៤", "");
        final QuestionsList question9 = new QuestionsList("តើរាជធានីរបស់ប្រទេសជប៉ុនមានឈ្មោះអ្វី?",
                "A.សេអ៊ូល","B.ប៉េកាំង","C.តូក្យូ", "D.យុងយ៉ាង",
                "C.តូក្យូ", "");
        final QuestionsList question10 = new QuestionsList("តើប្រទេសអាល្លឺម៉ង់ប្រើប្រាស់ភាសាផ្លូវការជាភាសាអ្វី?",
                "A.ភាសាបារាំង","B.ភាសាអង់គ្លេស","C.ភាសាអ៊ីតាលី", "D.អាល្លឺម៉ង់",
                "D.អាល្លឺម៉ង់", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> ភូមិវិទ្យាQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // put Question option and Answer

        final QuestionsList question1 = new QuestionsList("តើប្រាសាទបាសិត ស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ព្រះវិហារ","B កំពង់ធំ","C បាត់ដំបង", "D សៀមរាប",
                "C បាត់ដំបង", "");
        final QuestionsList question2 = new QuestionsList("តើស្រុក បន្ទាយស្រី ស្ថិតក្នុងខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ខេត្ត ព្រៃវែង","B ខេត្ត កំពង់ចាម","C ខេត្ត សៀមរាប", "D ខេត្ត ក្រចេះ",
                "C ខេត្ត សៀមរាប", "");
        final QuestionsList question3 = new QuestionsList("តើភ្នំសុពណ៍កាឡីស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A បាត់ដំបង","B ស្ទឹងត្រែង","C ព្រះវិហារ", "D ក្រចេះ",
                "D ក្រចេះ", "");
        final QuestionsList question4 = new QuestionsList("តើស្រុក រុក្ខគិរី ស្ថិតក្នុងខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ខេត្ត សៀមរាប","B ខេត្ត កំពត","C ខេត្ត បាត់ដំបង", "D ខេត្ត ស្វាយរៀង",
                "C ខេត្ត បាត់ដំបង", "");
        final QuestionsList question5 = new QuestionsList("តើស្រុក ជាំក្សាន្ត ស្ថិតក្នុងខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ខេត្ត បាត់ដំបង","B ខេត្ត កំពត","C ខេត្ត ស្វាយរៀង", "D ខេត្ត ព្រះវិហារ",
                "D ខេត្ត ព្រះវិហារ", "");
        final QuestionsList question6 = new QuestionsList("តើរមណីយដ្ឋានភ្នំប្រសិទ្ធិស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A កំពង់ធំ","B តាកែវ","C ក្រចេះ", "D កណ្តាល",
                "D កណ្តាល", "");
        final QuestionsList question7 = new QuestionsList("តើទីក្រុងភ្នំពេញជារដ្ឋធានីនៃប្រទេសណា?",
                "A ប្រទេស ថៃ","B ប្រទេស កម្ពុជា","C ប្រទេស ឡាវ", "D ប្រទេស ខ្មែរ",
                "B ប្រទេស កម្ពុជា", "");
        final QuestionsList question8 = new QuestionsList("តើស្រុក បារ៉ាយ ស្ថិតក្នុងខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ខេត្ត កំពង់ធំ","B ខេត្ត បាត់ដំបង","C ខេត្ត កំពុងធំ", "D ខេត្ត បន្ទាយមានជ័យ",
                "A ខេត្ត កំពង់ធំ", "");
        final QuestionsList question9 = new QuestionsList("តើប្រាសាទវត្តព្រះធាតុថ្មដាស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A កំពង់ធំ","B ព្រះវិហារ","C កំពត", "D កំពង់ចាម",
                "D កំពង់ចាម", "");
        final QuestionsList question10 = new QuestionsList("តើរមណីយដ្ឋានអាងជីងចក់ស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A ប៉ៃលិន","B ខេត្ត បាត់ដំបង","C ខេត្ត កំពុងធំ", "D ខេត្ត បន្ទាយមានជ័យ",
                "A ប៉ៃលិន", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }


    private static List<QuestionsList> ផែនដីវិទ្យាQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // put Question option and Answer

        final QuestionsList question1 = new QuestionsList("តើប្រទេសកម្ពុជាមានរដូវប៉ុន្មាន?",
                "A.មាន២រដូវ","B.មាន៣រដូវ","C.មាន៤រដូវ", "D.មាន១រដូវ",
                "A.មាន២រដូវ", "");
        final QuestionsList question2 = new QuestionsList("តើរដូវវស្សានៅប្រទេសកម្ពុជាចាប់ផ្ដើមពីខែណាដល់ខែណា?",
                "A.មេសាដល់កញ្ញា","B.ឧសភាដល់តុលា","C.មិថុនាដល់ធ្នូ", "D.វិច្ឆិកាដល់មេសា",
                "B.ឧសភាដល់តុលា", "");
        final QuestionsList question3 = new QuestionsList("ប្រទេសកម្ពុជាទទួលឥទ្ធិពលខ្យល់?",
                "A.ខ្យល់មូសុងវស្សា","B.ខ្យល់មូសុងប្រាំង","C.ខ្យល់មូសុង", "D.ខ្យល់អាល់លីហ្សឺ",
                "A.ខ្យល់មូសុងវស្សា", "");
        final QuestionsList question4 = new QuestionsList("តើព្រះចន្ទទទួលពន្លឺពីអ្វី?",
                "A.ផែនដី","B.ព្រះអាទិត្យ","C.ភពអង្គារ៏", "D.ផ្កាយ",
                "B.ព្រះអាទិត្យ", "");
        final QuestionsList question5 = new QuestionsList("តើផ្លាកតិចតូនិចដែលមានចលនាជ្រួសគ្នាបង្កើតឱ្យមានអ្វី?",
                "A.បំណាក់ស្រុតបញ្រ្ជាស","B.បំណាក់ស្រុតជ្រួស","C.បំណាក់ស្រុតធម្មតា", "D.បំណាក់ស្រុតរួមគ្នា",
                "B.បំណាក់ស្រុតជ្រួស", "");
        final QuestionsList question6 = new QuestionsList("តើឆ្នាំដែលមាន១៣ខែគេហៅថាឆ្នាំអ្វី?",
                "A.ឆ្នាំលើកក្រោយ","B.ឆ្នាំមានអធិកមាស","C.ឆ្នាំចន្ទគតិ", "D.ឆ្នាំសុរិយគតិ",
                "B.ឆ្នាំមានអធិកមាស", "");
        final QuestionsList question7 = new QuestionsList("តើផ្លាកតិចតូនិចមានចលនាដោយសារកម្លាំងអ្វី?(លើកលែងតែ)",
                "A.កម្លាំងអាតូម","B.កម្លាំងទ្រនុញ","C.កម្លាំងរង្វល់", "D.កម្លាំងទំនាញនៃមណ្ឌលថ្ម",
                "A.កម្លាំងអាតូម", "");
        final QuestionsList question8 = new QuestionsList("តើឧបទ្វីបឥណ្ឌាប៉ះគ្នាជាមួយទ្វីបណា?",
                "A.ទ្វីបអូសេអានី","B.ទ្វីបអាស៊ី","C.ទ្វីបអឺរ៉ាស៊ី", "D.ទ្វីបអឺរ៉ុប",
                "C.ទ្វីបអឺរ៉ាស៊ី", "");
        final QuestionsList question9 = new QuestionsList("តើទ្រឹស្ដីគម្លាតបាតសមុទ្ររកឃើញដោយនរណា?",
                "A.គ្រឹស្តុបគូឡុំ","B.ហារីហេស","C.អាល់ព្រីដវេសេនឺ", "D.អាញស្តាញ",
                "B.ហារីហេស", "");
        final QuestionsList question10 = new QuestionsList("តើប្រទេសកម្ពុជាមានផ្ទៃដីក្រឡាប៉ុន្មានគីឡូម៉ែត្រការេ៉?",
                "A.182035គីឡូម៉ែត្រការេ៉","B.181030គីឡូម៉ែត្រការេ៉","C.181035ម៉ែត្រការេ៉", "D.181035គីឡូម៉ែត្រការេ៉",
                "D.181035គីឡូម៉ែត្រការេ៉", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }

    private static List<QuestionsList> ចំណេះដឹងទូទៅQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // put Question option and Answer

        final QuestionsList question1 = new QuestionsList("តើប្រាសាទអង្គរវត្តបែរមុខទៅទិសខាងណា?",
                "A.ខាងលិច ","B.ខាងកើត","C.ខាងត្បូង", "D.ខាងជើង",
                "A.ខាងលិច ", "");
        final QuestionsList question2 = new QuestionsList("តើប្រាសាទអង្គរវត្តមានកំពូលធំៗចំនួនប៉ុន្មាន?",
                "A.កំពូល៣","B.កំពូល៤","C.កំពូល៦", "D.កំពូល៥",
                "D.កំពូល៥", "");
        final QuestionsList question3 = new QuestionsList("តើក្រុងប៉ោយប៉ែតស្ថិតនៅក្នុងខេត្តណា?",
                "A.បន្ទាយមានជ័យ","B.ព្រះវិហារ","C.ពោធិ៍សាត់", "D.បាត់ដំបង",
                "A.បន្ទាយមានជ័យ", "");
        final QuestionsList question4 = new QuestionsList("តើខេត្តណាដែលមានប្រាសាទច្រើនជាងគេ?",
                "A.បាត់ដំបង","B.ពោធិ៍សាត់","C.តាកែវ", "D.សៀមរាប",
                "D.សៀមរាប", "");
        final QuestionsList question5 = new QuestionsList("តើប្រទេសកម្ពុជាមានព្រំប្រទល់ជាប់និង វៀតណាម ឡាវ និង.....",
                "A.ភូមា","B.អាមេរិក","C.ថៃ", "D.ម៉ាឡេស៊ី",
                "C.ថៃ", "");
        final QuestionsList question6 = new QuestionsList("តើបទចម្រៀងដែលមានចំណងជើងថា ឆ្នាំមុន ជាសំនៀងរបស់តារាចម្រៀងរូបណា?",
                "A.លោក កែវ សារ៉ាត","B.លោក ស៊ិន ស៊ីសាមុត","C.លោក អ៊ិន យ៉េង", "D.លោក អ៊ឹម សុងសឺម",
                "D.លោក អ៊ឹម សុងសឺម", "");
        final QuestionsList question7 = new QuestionsList("តើរមណីយដ្ឋានអាងជីងចក់ស្ថិតនៅខេត្តណានៃប្រទេសកម្ពុជា?",
                "A.ប៉ៃលិន","B.បន្ទាយមានជ័យ","C.សៀមរាប", "D.កំពង់ធំ",
                "A.ប៉ៃលិន", "");
        final QuestionsList question8 = new QuestionsList("តើពាក្យថា'ពលៈ'ក្នុងព្រះពុទ្ធសាសនាមានន័យដូចម្តេច?",
                "A.ឲ្យមានកម្លាំងកាយមាំមួន","B.ឲ្យមានសេចក្តីសុខ","C.ឲ្យមានអាយុយឺនយូរ", "D.ឲ្យមានសម្បុរកាយល្អ",
                "A.ឲ្យមានកម្លាំងកាយមាំមួន", "");
        final QuestionsList question9 = new QuestionsList("តើខែកក្កដាស្ថិតនៅលេខរៀងទីប៉ុន្មាននៃឆ្នាំសុរិយគតិ?",
                "A.លេខរៀងទី ៦","B.លេខរៀងទី ៩","C.លេខរៀងទី ៨", "D.លេខរៀងទី ៧",
                "D.លេខរៀងទី ៧", "");
        final QuestionsList question10 = new QuestionsList("តើប្រទេសក្នុងតំបន់អាស៊ីអាគ្នេយ៍យើងបច្ចុប្បន្នមានប៉ុន្មានប្រទេស?",
                "A.១០ប្រទេស","B.១១ប្រទេស","C.១២ប្រទេស", "D.១៣ប្រទេស",
                "B.១១ប្រទេស", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;

    }
    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "ប្រវត្តិវិទ្យា":
                return ប្រវត្តិវិទ្យាQuestions();
            case "ភូមិវិទ្យា":
                return ភូមិវិទ្យាQuestions();
            case "ចំណេះដឹងទូទៅ":
                return ចំណេះដឹងទូទៅQuestions();
            default:
                return ផែនដីវិទ្យាQuestions();
        }
    }
}


