public class Teacher {
    public Section[] getSection() {
        return Section;
    }

    public void setSection(Section[] section) {
        Section = section;
    }

    public String getSubject() {
        return subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public int getGetSubject() {
        return getSubject;
    }

    public void setGetSubject(int getSubject) {
        this.getSubject = getSubject;
    }

    public Section[] getGetSections() {
        return getSections;
    }

    public void setGetSections(Section[] getSections) {
        this.getSections = getSections;
    }

    public int getAddSection() {
        return addSection;
    }

    public void setAddSection(int addSection) {
        this.addSection = addSection;
    }

    private Section[] Section;
    private String subject;
    private int sectionCount;
    public int getSubject;
    public void setSubject(String n){
    }
    public Section[] getSections;
    public int addSection;
}
