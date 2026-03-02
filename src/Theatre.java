public class Theatre {
    public static void main(String[] args) {
        Actor a1 = new Actor("Imran", "Bavdinov", Gender.MALE, 180);
        Actor a2 = new Actor("Alan", "Kerimzhanov", Gender.MALE, 179);
        Actor a3 = new Actor("Farida", "Saidulaeva", Gender.FEMALE, 175);

        Director d1 = new Director("Radmir", "Molotov", Gender.MALE, 10);
        Director d2 = new Director("Radmila", "Khalmetova", Gender.FEMALE, 8);

        Person composer = new Person("Чайковский", "Петр", Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        Show drama = new Show("Гамлет", 120, d1);
        Opera opera = new Opera("Травиата", 150, d2, composer, "Текст либретто оперы", 40);
        Ballet ballet = new Ballet("Щелкунчик", 140, d1, composer, "Текст либретто балета", choreographer);

        drama.addActor(a1);
        drama.addActor(a2);

        opera.addActor(a2);
        opera.addActor(a3);

        ballet.addActor(a1);

        drama.printActor();
        opera.printActor();
        ballet.printActor();

        drama.replaceActor("Bavdinov", a3);
        drama.printActor();

        opera.replaceActor("Iminov", a1);

        opera.printLibretto();
        ballet.printLibretto();

    }
}
