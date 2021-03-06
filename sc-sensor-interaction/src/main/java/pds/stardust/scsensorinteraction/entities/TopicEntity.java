package pds.stardust.scsensorinteraction.entities;

public class TopicEntity {

    private String id;
    private String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TopicEntity(String label) {
        this.label = label;
    }
}
