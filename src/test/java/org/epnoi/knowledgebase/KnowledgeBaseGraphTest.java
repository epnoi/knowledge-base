package org.epnoi.knowledgebase;


import org.epnoi.knowledgebase.model.Concept;
import org.epnoi.knowledgebase.model.Relation;
import org.epnoi.knowledgebase.model.RelationsBuilder;
import org.epnoi.knowledgebase.storage.KnowledgeBaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = KnowledgeBaseApp.class)
public class KnowledgeBaseGraphTest{
    @Autowired
    private KnowledgeBaseRepository repository;

    @Test
    public void testGraph(){
        Concept conceptA = new Concept("conceptA");
        Concept conceptB = new Concept("conceptB");
        Relation relation = RelationsBuilder.newBuilder().setRelationType("isA").setSource(conceptA).

      //  repository.save(conceptA);


        System.out.println("----> "+repository.findAll());
    }

}