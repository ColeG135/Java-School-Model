public class School {
    private int name;
    private Section[] Section;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Section[] getSection() {
        return Section;
    }

    public void setSection(Section[] section) {
        Section = section;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public int getGetName() {
        return getName;
    }

    public int setGetName(int getName) {
        return getName;
    }

    public int getAddSection() {
        return addSection;
    }

    public void setAddSection(int addSection) {
        this.addSection = addSection;
    }

    public Section[] getGetSections() {
        return getSections;
    }

    public void setGetSections(Section[] getSections) {
        this.getSections = getSections;
    }

    private int sectionCount;
    public int getName;

    int addSection;
    Section[] getSections;
}
