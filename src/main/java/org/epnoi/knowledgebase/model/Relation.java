package org.epnoi.knowledgebase.model;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by rgonza on 10/07/16.
 */

@RelationshipEntity(type = "RELATION")
public class Relation {
    @GraphId
    private Long relationshipId;
    @StartNode
    private Concept source;
    @EndNode
    private Concept target;

    public Relation(){

    }




    public Long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Long relationshipId) {
        this.relationshipId = relationshipId;
    }

    public Concept getSource() {
        return source;
    }

    public void setSource(Concept source) {
        this.source = source;
    }

    public Concept getTarget() {
        return target;
    }

    public void setTarget(Concept target) {
        this.target = target;
    }
}

