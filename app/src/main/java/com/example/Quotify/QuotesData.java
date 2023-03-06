package com.example.Quotify;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    public static List<QuotesList> getLifeQuotes() {

        final List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("There is nothing impossible to they who will try.", "Alexander the Great");
        lifeQuotesList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList( "And now that you don't have to be perfect, you can be good.", "John Steinbeck");
        lifeQuotesList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("Life is never fair, and perhaps it is a good thing for most of us that it is not.", "Oscar Wilde");
        lifeQuotesList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("Anyone who has never made a mistake has never tried anything new.", "Albert Einstein");
        lifeQuotesList.add(lifeQuote4);

        QuotesList lifeQuote5 = new QuotesList("Never give up on someone who is having a bad day. Tomorrow could be yours.", "Giovannie de Sadeleer");
        lifeQuotesList.add(lifeQuote5);



        return lifeQuotesList;
    }

    public static List<QuotesList> getMotivationQuotes(){

        final List<QuotesList> motivationQuotesList = new ArrayList<>();

        QuotesList motivationQuote1 = new QuotesList("You can always edit a bad page. You can’t edit a blank page.", "Jodi Picoult");
        motivationQuotesList.add(motivationQuote1);

        QuotesList motivationQuote2 = new QuotesList( "You can’t fail if you don’t quit. You can’t succeed if you don’t start.", "Michael Hyatt");
        motivationQuotesList.add(motivationQuote2);

        QuotesList motivationQuote3 = new QuotesList("Inspiration may sometimes fail to show up for work in the morning, but determination never does.", "K.M. Weiland");
        motivationQuotesList.add(motivationQuote3);

        QuotesList motivationQuote4 = new QuotesList("Opportunities don’t happen. You create them.", "Chris Grosser");
        motivationQuotesList.add(motivationQuote4);

        QuotesList motivationQuote5 = new QuotesList("Done is better than perfect.", "Sheryl Sandberg");
        motivationQuotesList.add(motivationQuote5);

        return motivationQuotesList;
    }

    public static List<QuotesList> getLoveQuotes(){

        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuotesList1 = new QuotesList("If it is right, it happens—the main thing is not to hurry. Nothing good gets away.", "John Steinbeck");
        loveQuotesList.add(loveQuotesList1);

        QuotesList loveQuotesList2 = new QuotesList( "A loving heart is the truest wisdom.", "Charles Dickens");
        loveQuotesList.add(loveQuotesList2);

        QuotesList loveQuotesList3 = new QuotesList("I have learned not to worry about love; but to honor its coming with all my heart.", "Alice Walker");
        loveQuotesList.add(loveQuotesList3);

        QuotesList loveQuotesList4 = new QuotesList("Love is like the wind, you can’t see it but you can feel it.", "Nicholas Sparks");
        loveQuotesList.add(loveQuotesList4);

        QuotesList loveQuotesList5 = new QuotesList("We love the things we love for what they are.", "Robert Frost");
        loveQuotesList.add(loveQuotesList5);

        return loveQuotesList;
    }

    public static List<QuotesList> getSuccessQuotes(){

        final List<QuotesList> SuccessQuotesList = new ArrayList<>();

        QuotesList SuccessQuotesList1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them.", "Albert Einstein");
        SuccessQuotesList.add(SuccessQuotesList1);

        QuotesList SuccessQuotesList2 = new QuotesList( "When you give joy to other people, you get more joy in return. You should give a good thought to happiness that you can give out.", "Eleanor Roosevelt");
        SuccessQuotesList.add(SuccessQuotesList2);

        QuotesList SuccessQuotesList3 = new QuotesList("Success is not final; failure is not fatal: It is the courage to continue that counts.", "Winston S. Churchill");
        SuccessQuotesList.add(SuccessQuotesList3);

        QuotesList SuccessQuotesList4 = new QuotesList("The road to success and the road to failure are almost exactly the same.", "Colin R. Davis");
        SuccessQuotesList.add(SuccessQuotesList4);

        QuotesList SuccessQuotesList5 = new QuotesList("Success is getting what you want, happiness is wanting what you get.", "W. P. Kinsella");
        SuccessQuotesList.add(SuccessQuotesList5);

        return SuccessQuotesList;
    }

    public static List<QuotesList> getEnglishQuotes(){

        final List<QuotesList> EnglishQuotesList = new ArrayList<>();

        QuotesList EnglishQuotesList1 = new QuotesList("All that glitters is not gold.", "William Shakespeare");
        EnglishQuotesList.add(EnglishQuotesList1);

        QuotesList EnglishQuotesList2 = new QuotesList( "Ask, and it shall be given you; seek, and you shall find.", "The Bible");
        EnglishQuotesList.add(EnglishQuotesList2);

        QuotesList EnglishQuotesList3 = new QuotesList("The love of money is the root of all evil.", "The Bible");
        EnglishQuotesList.add(EnglishQuotesList3);

        QuotesList EnglishQuotesList4 = new QuotesList("If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.", "Oprah Winfrey");
        EnglishQuotesList.add(EnglishQuotesList4);

        QuotesList EnglishQuotesList5 = new QuotesList("Always remember that you are absolutely unique. Just like everyone else.", "Margaret Mead");
        EnglishQuotesList.add(EnglishQuotesList5);

        return EnglishQuotesList;
    }

}
