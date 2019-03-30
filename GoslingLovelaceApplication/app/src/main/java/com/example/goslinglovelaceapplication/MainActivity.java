package com.example.goslinglovelaceapplication;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
        Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
        int ori = mConfiguration.orientation; //获取屏幕方向
        if (ori == Configuration.ORIENTATION_LANDSCAPE) {
            //横屏
            initHor();
        } else if (ori == Configuration.ORIENTATION_PORTRAIT) {
            //竖屏
            initVer();
        }
    }
    private void initVer(){
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text_ada);
        String language = getResources().getConfiguration().locale.getLanguage();
        if(language.equals("zh")){
            String str = "奥古斯塔王艾达，洛夫莱斯伯爵夫人（娘家姓 拜伦 ; 1815 12月10日- 1852年11月27日）是英国数学家和作家，主要是知道她的工作查尔斯·巴贝奇的提议机械通用计算机的分析引擎。她是第一个认识到该机器具有超出纯计算范围的应用程序，并发布了第一个由这种机器执行的算法。因此，她有时被认为是第一个认识到“ 计算机 ”和第一批计算机程序员之一的全部潜力的人。[2] [3] [4]\n" +
                    "Lovelace是诗人Lord Byron和他的妻子Anne Isabella“Annabella”Milbanke，Wentworth夫人的唯一合法孩子。[5]拜伦的所有其他孩子都是非婚生子女。[6]拜伦在艾达出生一个月后与妻子分开，四个月后永远离开英格兰。他纪念一首诗中的离别开头说：“你的脸像你的母亲是我的孩子！ADA！我家和心灵的唯一女儿？”。[7]当阿达八岁时，他在希腊独立战争中死于疾病。她的母亲仍然痛苦，并提升了阿达对数学和逻辑的兴趣，以防止她发展她父亲的疯狂感。尽管如此，阿达仍然对拜伦感兴趣，并在她最终死亡时，应她的要求埋在他旁边。她童年时常常生病。阿达于1835年与威廉·金结婚。金在1838年成为洛夫莱斯伯爵，阿达因此成为洛夫莱斯的伯爵夫人。\n" +
                    "她的教育和社会功绩使她与安德鲁·克罗斯，大卫·布鲁斯特爵士，查尔斯·惠斯通，迈克尔·法拉第和作家查尔斯·狄更斯等科学家取得了联系。阿达将她的方法描述为“诗学科学” [8]并将自己描述为“分析师（和形而上学家）”。[9]\n" +
                    "当她十几岁的时候，她的数学才能使她与英国数学家查尔斯巴贝奇（又称“计算机之父”）建立了长期的工作关系和友谊，特别是巴贝奇在分析引擎方面的工作。洛夫莱特于1833年6月首次通过他们的共同朋友和她的私人导师玛丽萨默维尔与他见面。\n" +
                    "在1842年至1843年间，阿达翻译了意大利军事工程师路易吉·梅纳布雷亚（Luigi Menabrea）关于计算引擎的一篇文章，并用一套精心设计的笔记补充它，简称为笔记。这些注释包含许多人认为是第一个计算机程序 - 即设计为由机器执行的算法。其他历史学家拒绝这种观点，并指出Babbage的1836/1837年的个人笔记包含了引擎的第一个程序。[10] Lovelace的笔记在计算机的早期历史中很重要。她还提出了计算机不仅仅是计算或数字运算的能力的愿景，而包括巴贝奇本人在内的许多其他人只关注这些能力。[11]她对“诗学科学”的看法促使她提出有关分析引擎的问题（如她的笔记所示），研究个人和社会如何将技术作为一种协作工具。[6]\n" +
                    "她于1852年去世，享年36岁，死于子宫癌。";
            text.setText(str);
            text = findViewById(R.id.title_ada);
            str = "艾达洛夫莱斯";
            text.setText(str);
        }else{
            String str = "Augusta Ada King, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage\\'s proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a \"computing machine\" and one of the first computer programmers.[2][3][4]\n" +
                    "Lovelace was the only legitimate child of the poet Lord Byron and his wife Anne Isabella \"Annabella\" Milbanke, Lady Wentworth.[5] All of Byron\\'s other children were born out of wedlock to other women.[6] Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, \"Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart?\".[7] He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada\\'s interest in mathematics and logic in an effort to prevent her from developing her father\\'s perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, Ada thereby becoming Countess of Lovelace.\n" +
                    "Her educational and social exploits brought her into contact with scientists such as Andrew Crosse, Sir David Brewster, Charles Wheatstone, Michael Faraday and the author Charles Dickens, contacts which she used to further her education. Ada described her approach as \"poetical science\"[8] and herself as an \"Analyst (and Metaphysician)\".[9]\n" +
                    "When she was a teenager, her mathematical talents led her to a long working relationship and friendship with fellow British mathematician Charles Babbage, also known as \"the father of computers\", and in particular, Babbage's work on the Analytical Engine. Lovelace first met him in June 1833, through their mutual friend, and her private tutor, Mary Somerville.\n" +
                    "Between 1842 and 1843, Ada translated an article by Italian military engineer Luigi Menabrea on the calculating engine, supplementing it with an elaborate set of notes, simply called Notes. These notes contain what many consider to be the first computer program—that is, an algorithm designed to be carried out by a machine. Other historians reject this perspective and point out that Babbage's personal notes from the years 1836/1837 contain the first programs for the engine.[10] Lovelace's notes are important in the early history of computers. She also developed a vision of the capability of computers to go beyond mere calculating or number-crunching, while many others, including Babbage himself, focused only on those capabilities.[11] Her mindset of \"poetical science\" led her to ask questions about the Analytical Engine (as shown in her notes) examining how individuals and society relate to technology as a collaborative tool.[6]\n" +
                    "She died of uterine cancer in 1852 at the age of 36.";
            text.setText(str);
        }
    }
    private void initHor(){
        setContentView(R.layout.activity_main_hor);
        TextView text = findViewById(R.id.text_james);
        String language = getResources().getConfiguration().locale.getLanguage();
        if(language.equals("zh")){
            String str = "詹姆斯·高斯林获得了科学学士从卡尔加里大学 [4]和他的硕士和博士学位 来自卡内基梅隆大学，都是计算机科学专业。[2] [5] [6]他在攻读博士学位期间写了一个名为Gosling Emacs（Gosmacs）的Emacs版本。在加入Sun Microsystems之前，他在卡内基梅隆大学为一个16路计算机系统[7]构建了一个多处理器版本的Unix 。他还在那里开发了几个编译器和邮件系统。\n" +
                    "Gosling在1984年至2010年间（26年）与Sun Microsystems合作。他被称为Java编程语言之父。[8] [9]他通过将Perq Q-Code转换为VAX汇编程序并模拟硬件，从PERQ编写程序到端口软件时得到了Java VM的想法。在被Oracle公司收购后，他于2010年4月2日离开Sun Microsystems ，[8]理由是薪酬，地位和决策能力下降，以及角色和道德挑战的变化。[10]此后，他在采访中对甲骨文采取了非常批评的立场，并指出“在Sun与甲骨文之间的整合会议期间，我们对Sun和Google之间的专利情况进行了抨击，我们可以看到甲骨文律师的眼睛闪闪发光“。[9]他澄清了他在甲骨文谷歌对谷歌的审判中的立场：“虽然我与甲骨文存在分歧，但在这种情况下，他们是在右边。谷歌完全贬低了太阳。我们都非常不安，甚至乔纳森施瓦茨 ;他刚决定戴上幸福的脸，试图将柠檬变成柠檬水，这让很多人对Sun感到恼火。“ [11]但是，他批准了法院的裁决，即API不应该是受版权保护的。[12]\n" +
                    "2011年3月，Gosling离开甲骨文去谷歌工作。[13]六个月后，他跟随他的同事比尔瓦斯并加入了一家名为Liquid Robotics的创业公司。[1] 2016年末，Liquid Robotics被波音公司收购。[14]收购完成后，Gosling 于2017年5月离开Liquid Robotics，在亚马逊网络服务公司担任杰出工程师。[15]\n" +
                    "他是Scala公司Lightbend的顾问，[16] Jelastic的独立董事，[17]和Eucalyptus的战略顾问，[18]并且是DIRTT Environmental Solutions的董事会成员。[19]\n" +
                    "他被称为他的证明“未知”的爱，并指出，他最喜欢的无理数是√ 2。他的第1000位的框架画面√ 2在他的办公室。[20]";
            text.setText(str);
            text = findViewById(R.id.title_James);
            str = "詹姆斯戈斯林";
            text.setText(str);
        }else{
            String str = "James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                    "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                    "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                    "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                    "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.[20]";
            text.setText(str);
        }
    }
}
