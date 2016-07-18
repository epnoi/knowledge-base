package org.epnoi.knowledgebase.storage;

import org.epnoi.knowledgebase.model.Concept;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by rgonza on 10/07/16.
 */
@Repository
public interface KnowledgeBaseRepository extends GraphRepository<Concept> {
}
