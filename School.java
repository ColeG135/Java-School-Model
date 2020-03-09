public class School {
    private String name;
    private Section[] Section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
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
    public String getName;

    int addSection;
    Section[] getSections;
}
