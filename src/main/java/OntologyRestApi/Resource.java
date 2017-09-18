package OntologyRestApi;

//import org.checkerframework.checker.nullness.qual.NonNull;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
//import org.semanticweb.owlapi.apibinding.OWLManager;
//import org.semanticweb.owlapi.model.OWLOntology;
//import org.semanticweb.owlapi.model.OWLOntologyCreationException;
//import org.semanticweb.owlapi.model.OWLOntologyManager;
//import org.swrlapi.factory.SWRLAPIFactory;
//import org.swrlapi.parser.SWRLParseException;
//import org.swrlapi.sqwrl.SQWRLQueryEngine;
//import org.swrlapi.sqwrl.SQWRLResult;
//import org.swrlapi.sqwrl.exceptions.SQWRLException;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.swrlapi.factory.SWRLAPIFactory;
import org.swrlapi.parser.SWRLParseException;
import org.swrlapi.sqwrl.SQWRLQueryEngine;
import org.swrlapi.sqwrl.SQWRLResult;
import org.swrlapi.sqwrl.exceptions.SQWRLException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

import OntologyRestApi.model.ReqModel;
import com.sun.corba.se.spi.ior.ObjectKey;
import jdk.nashorn.internal.parser.JSONParser;
import org.eclipse.jetty.server.Response;
//import org.json.*;
//import org.swrlapi.factory.SWRLAPIFactory;
//import org.swrlapi.parser.SWRLParseException;
//import org.swrlapi.sqwrl.SQWRLQueryEngine;
//import org.swrlapi.sqwrl.SQWRLResult;
//import org.swrlapi.sqwrl.exceptions.SQWRLException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
//import org.semanticweb.owlapi.apibinding.OWLManager;
//import org.semanticweb.owlapi.model.OWLOntology;
//import org.semanticweb.owlapi.model.OWLOntologyCreationException;
//import org.semanticweb.owlapi.model.OWLOntologyManager;
//import org.swrlapi.factory.SWRLAPIFactory;
//import org.swrlapi.parser.SWRLParseException;
//import org.swrlapi.sqwrl.SQWRLQueryEngine;
//import org.swrlapi.sqwrl.SQWRLResult;
//import org.swrlapi.sqwrl.exceptions.SQWRLException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response.Status;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

@Path("home")
public class Resource {


    @GET
    @Path("/criminalOnt")
    public String getUsers(@QueryParam("offender") String offender
                        ,@QueryParam("party") String party
                        ,@QueryParam("innocent") String innocent
                        ,@QueryParam("rwv") String rwv
                        ,@QueryParam("attemped") String attemped
                        ,@QueryParam("committed") String committed
                        ,@QueryParam("crimesucceed") String crimesucceed
                        ,@QueryParam("makingdecistion") String makingdecistion
                        ,@QueryParam("preparing") String preparing
                        ,@QueryParam("considering") String considering
                        ,@QueryParam("victim") String victim
                        ,@QueryParam("victimdetail") String victimdetail
                        ,@QueryParam("adddetail") String adddetail
                        ,@QueryParam("tranintent") String tranintent
                        ,@QueryParam("intenact") String intenact
                        ,@QueryParam("foreseeneffect") String foreseeneffect
                        ,@QueryParam("negligence") String negligence
                        ,@QueryParam("nointention") String nointention
                        ,@QueryParam("causation") String causation
                        ,@QueryParam("nocriminalimpu") String nocriminalimpu
                        ,@QueryParam("entrapmentWithOfficer") String entrapmentWithOfficer
                        ,@QueryParam("committedBySpourse") String committedBySpourse
                        ,@QueryParam("actAccor") String actAccor
                        ,@QueryParam("intoxication") String intoxication
                        ,@QueryParam("mental") String mental
                        ,@QueryParam("child") String child
                        ,@QueryParam("necessity") String necessity
                        ,@QueryParam("assent") String assent
                        ,@QueryParam("defend") String defend
                        ,@QueryParam("actIsLawful") String actIsLawful
                        ,@QueryParam("dangerToBeImminent") String dangerToBeImminent
                        ,@QueryParam("danger") String danger
                        ,@QueryParam("nojust") String nojust){

        ReqModel req = new ReqModel();
        req.setNojust(nojust);
        req.setOffender(offender);
        req.setParty(party);
        req.setInnocent(innocent);
        req.setRelationWithVictim(rwv);
        req.setAttemp(attemped);
        req.setCommitted(committed);
        req.setCrimeSucceed(crimesucceed);
        req.setMakingDecision(makingdecistion);
        req.setPreparing(preparing);
        req.setConsidering(considering);
        req.setVictim(victim);
        req.setVictimDetail(victimdetail);
        req.setAdditionalDetail(adddetail);
        req.setTransferIntent(tranintent);
        req.setIntentionallyAct(intenact);
        req.setForeseenTheEffect(foreseeneffect);
        req.setNegligence(negligence);
        req.setNoIntention(nointention);
        req.setCausation(causation);

        // Criminal Impunity
        req.setNoCriminalImpunity(nocriminalimpu);
        req.setEntrapmentWithOfficer(entrapmentWithOfficer);
        req.setCommittedBySpourse(committedBySpourse);
        req.setActAccordanceWithTheOrder(actAccor);
        req.setIntoxication(intoxication);
        req.setMentalInfirmly(mental);
        req.setChild(child);
        req.setNecessity(necessity);

        // Jusification
        req.setAssent(assent);
        req.setDefendin(defend);
        req.setActIsLawfulDefense(actIsLawful);
        req.setDangerToBeImminent(dangerToBeImminent);
        req.setDanger(danger);

        BuildNewOWL(req);

        String Ans = getData();
        return Ans;
    }


    public static void BuildNewOWL(ReqModel input)
    {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse("ontology/0911-original.owl");

            // Get the staff element by tag name directly
            Node rootNode = doc.getElementsByTagName("rdf:RDF").item(0);

            // Init victim section
            Element victim = doc.createElement("Victim");
            Element vic_detail = doc.createElement("has_victim_detail");
            Element with_add = doc.createElement("with_additional");

            // Init offender
            Element off = doc.createElement("Offender");
            Element take = doc.createElement("take");
            Element Consider = doc.createElement("Considering");
            Element CrimeSucceed = doc.createElement("CrimeSucceed");
            Element with = doc.createElement("with");

            // Init Objective element
            Element obj_elem = doc.createElement("ObjectiveElement");
            Element has_actor = doc.createElement("has_actor");
            Element has_action = doc.createElement("has_action");
            Element has_victim = doc.createElement("has_victim");
            Element has_additional = doc.createElement("has_addtional");
            Element rwse = doc.createElement("related_with_subjective_element");

            // Init Element of crime
            Element eoc = doc.createElement("ElementOfCrime");
            Element con_cri_im = doc.createElement("consider_criminal_impunity");
            Element con_jus = doc.createElement("consider_justification");
            Element has_sub = doc.createElement("has_subjective_of_element");
            Element has_obj = doc.createElement("has_objective_of_element");
            Element has_cau = doc.createElement("has_causation");


            //VICTIM

            if(input.getVictim() != null) {
                victim.setAttribute("rdf:ID",input.getVictim() );
                has_victim.setAttribute("rdf:resource","#"+input.getVictim());
                with.setAttribute("rdf:resource","#"+input.getVictim());

                //victim.setAttribute("rdf:ID","MissC");
                if (input.getVictimDetail() != null) ;
                {

                    victim.appendChild(vic_detail);
                    vic_detail.setAttribute("rdf:resource", "#"+input.getVictimDetail());
                    //vic_detail.setAttribute("rdf:resource","#NoVictimDetail");
                }

                if (input.getAdditionalDetail() != null) ;
                {
                    victim.appendChild(with_add);
                    with_add.setAttribute("rdf:resource", "#"+input.getAdditionalDetail());
                    has_additional.setAttribute("rdf:resource","#"+input.getAdditionalDetail());
                    //with_add.setAttribute("rdf:resource","#Noadd");
                }
            }

            //Action

            if(input.getCrimeSucceed() != null && input.getCrimeSucceed() != ""){
                off.appendChild(take);
                take.appendChild(CrimeSucceed);
                has_action.setAttribute("rdf:resource","#"+input.getCrimeSucceed());
                CrimeSucceed.setAttribute("rdf:ID",input.getCrimeSucceed());
                CrimeSucceed.appendChild(with);
            }

            if(input.getConsidering() != null){
                off.appendChild(take);
                take.appendChild(Consider);
                has_action.setAttribute("rdf:resource","#"+input.getConsidering());
                Consider.setAttribute("rdf:ID",input.getConsidering());
                Consider.appendChild(with);
            }

            //OFFENDER

            if(input.getOffender() != null){
                off.setAttribute("rdf:ID",input.getOffender());
                has_actor.setAttribute("rdf:resource","#"+input.getOffender());
            }


            //OBJECTIVE ELEMENT
            has_obj.setAttribute("rdf:resource","#ObjElem288");
            obj_elem.setAttribute("rdf:ID","ObjElem288");


            obj_elem.appendChild(has_actor);
            obj_elem.appendChild(has_action);
            obj_elem.appendChild(has_victim);
            obj_elem.appendChild(has_additional);
            obj_elem.appendChild(rwse);

            //ELEMENT OF CRIME

            eoc.setAttribute("rdf:ID","eoc288");

            if(input.getNoCriminalImpunity() != null){
                con_cri_im.setAttribute("rdf:resource","#"+input.getNoCriminalImpunity());
            }

            if(input.getNojust()!= null){
                con_jus.setAttribute("rdf:resource","#"+input.getNojust());
            }

            if(input.getCausation() != null){
                has_cau.setAttribute("rdf:resource","#"+input.getCausation() );
            }


            // Subjective element
            if(input.getIntentionallyAct() != null){
                has_sub.setAttribute("rdf:resource","#"+input.getIntentionallyAct());
                rwse.setAttribute("rdf:resource","#"+input.getIntentionallyAct());
            }

            if(input.getNoIntention() != null){
                has_sub.setAttribute("rdf:resource","#"+input.getNoIntention());
                rwse.setAttribute("rdf:resource","#"+input.getNoIntention());
            }

            if(input.getNegligence() != null){
                has_sub.setAttribute("rdf:resource","#"+input.getNegligence());
                rwse.setAttribute("rdf:resource","#"+input.getNegligence());
            }

            eoc.appendChild(con_cri_im);
            eoc.appendChild(con_jus);
            eoc.appendChild(has_sub);
            eoc.appendChild(has_obj);
            eoc.appendChild(has_cau);

            // ADD TO INPUT DATA (ROOT) NODE
            rootNode.appendChild(victim);
            rootNode.appendChild(off);
            rootNode.appendChild(obj_elem);
            rootNode.appendChild(eoc);


            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ontology/destination.owl"));
            transformer.transform(source, result);

            System.out.println("Done");



        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
    }

    public String getData() {

        String ans = "";
        try {
            // Create an OWL ontology using the OWLAPI
            OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
            OWLOntology ontology = ontologyManager.loadOntologyFromOntologyDocument(new File("ontology/destination.owl"));

            // Create SQWRL query engine using the SWRLAPI
            SQWRLQueryEngine queryEngine = SWRLAPIFactory.createSQWRLQueryEngine(ontology);

            // Create and execute a SQWRL query using the SWRLAPI
            queryEngine.createSQWRLQuery("sec288", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ has_addtional(?k, Noadd) ^ has_victim_detail(?j, NoVictimDetail) ^ IntentionallyAct(?x) ^  sameAs(?e, Section288) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?x, ?e)");
            queryEngine.createSQWRLQuery("sec289", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ IntentionallyAct(?x) ^ with_additional(?j, killParent) ^ sameAs(?e, Section289) ^ RelatedArticle(?e) ->  sqwrl:select(?g, ?h, ?j, ?e)");
            queryEngine.createSQWRLQuery("sec290-para1", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, Noadd) ^ No_Intention(?l)  ^  sameAs(?e, Section290-paragraph1) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");
            queryEngine.createSQWRLQuery("sec290-para2", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, killParent) ^ No_Intention(?l)  ^  sameAs(?e, Section290-paragraph2) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");
            queryEngine.createSQWRLQuery("sec291", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, Noadd) ^ Negligence(?l) ^ sameAs(?e, Section291) ^  RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");



            queryEngine.createSQWRLQuery("sec292", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, becruel)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, VictimKillThemSelf) ^ IntentionallyAct(?l) ^ has_victim_detail(?j, NoVictimDetail)^ sameAs(?e, Section292) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");
            queryEngine.createSQWRLQuery("sec293", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, encourage) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, VictimKillThemSelf) ^ IntentionallyAct(?l) ^ has_victim_detail(?j, lessthan16yr)    ^ sameAs(?e, Section293) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e) ");



            queryEngine.createSQWRLQuery("sec294", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, victimdied)        ^  has_actor(?k, ?g) ^ has_action(?k, ?h)   ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, Noadd) ^ IntentionallyAct(?l) ^ has_victim_detail(?j, group_morethan3) ^ sameAs(?e, Section294) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");
            queryEngine.createSQWRLQuery("sec295", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, injured)           ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ has_addtional(?k, Noadd) ^ IntentionallyAct(?x) ^ has_victim_detail(?j, NoVictimDetail)  ^ sameAs(?e, Section295) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?x, ?e)");
            queryEngine.createSQWRLQuery("sec296", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, injured)           ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ with_additional(?j, killParent) ^ IntentionallyAct(?x) ^ has_victim_detail(?j, NoVictimDetail) ^ sameAs(?e, Section296) ^ RelatedArticle(?e) ->  sqwrl:select(?g, ?h, ?j, ?e)");
            queryEngine.createSQWRLQuery("sec297", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, seriously_injured) ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ with_additional(?j, Noadd) ^ IntentionallyAct(?x) ^ has_victim_detail(?j, NoVictimDetail) ^  sameAs(?e, Section297) ^ RelatedArticle(?e) ->  sqwrl:select(?g, ?h, ?j, ?e) ");
            queryEngine.createSQWRLQuery("sec298", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, seriously_injured) ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?x) ^ with_additional(?j, killParent) ^ IntentionallyAct(?x) ^ has_victim_detail(?j, NoVictimDetail)^ sameAs(?e,  Section298-paragraph1) ^  RelatedArticle(?e) ->  sqwrl:select(?g, ?h, ?j, ?e)");
            queryEngine.createSQWRLQuery("sec299", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?x) ^ has_causation(?n, seriously_injured) ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, Noadd) ^ IntentionallyAct(?l)^  has_victim_detail(?j, group_morethan3) ^ sameAs(?e, Section299) ^ RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");
            queryEngine.createSQWRLQuery("sec300", "consider_justification(?n, ?y) ^ No_justification(?y) ^ consider_criminal_impunity(?n, ?z) ^ NoCriminalImpunity(?z) ^ has_objective_of_element(?n, ?k) ^ has_subjective_of_element(?n, ?l) ^ has_causation(?n, seriously_injured) ^  has_actor(?k, ?g) ^ has_action(?k, harm) ^ has_victim(?k, ?j) ^ take(?g, ?h) ^ with(?h, ?j) ^  related_with_subjective_element(?k, ?l) ^ has_addtional(?k, Noadd) ^ Negligence(?l)^ sameAs(?e, Section300) ^  RelatedArticle(?e) ->  sqwrl:select(?k, ?g, ?h, ?j, ?l, ?e)");


            SQWRLResult resultSec288 = queryEngine.runSQWRLQuery("sec288");
            SQWRLResult resultSec289 = queryEngine.runSQWRLQuery("sec289");
            SQWRLResult resultSec290para1 = queryEngine.runSQWRLQuery("sec290-para1");
            SQWRLResult resultSec290para2 = queryEngine.runSQWRLQuery("sec290-para2");
            SQWRLResult resultSec291 = queryEngine.runSQWRLQuery("sec291");
            SQWRLResult resultSec292 = queryEngine.runSQWRLQuery("sec292");
            SQWRLResult resultSec293 = queryEngine.runSQWRLQuery("sec293");
            SQWRLResult resultSec294 = queryEngine.runSQWRLQuery("sec294");
            SQWRLResult resultSec295 = queryEngine.runSQWRLQuery("sec295");
            SQWRLResult resultSec296 = queryEngine.runSQWRLQuery("sec296");
            SQWRLResult resultSec297 = queryEngine.runSQWRLQuery("sec297");
            SQWRLResult resultSec298 = queryEngine.runSQWRLQuery("sec298");
            SQWRLResult resultSec299 = queryEngine.runSQWRLQuery("sec299");
            SQWRLResult resultSec300 = queryEngine.runSQWRLQuery("sec300");


            ArrayList<String> sectionList = new ArrayList<String>();

            // Process the SQWRL result
            if (resultSec288.next())
                sectionList.add("resultSec288");
            if (resultSec289.next())
                sectionList.add("resultSec289");
            if (resultSec290para1.next())
                sectionList.add("resultSec290para1");
            if (resultSec290para2.next())
                sectionList.add("resultSec290para2");
            if (resultSec291.next())
                sectionList.add("resultSec291");
            if (resultSec292.next())
                sectionList.add("resultSec292");
            if (resultSec293.next())
                sectionList.add("resultSec293");
            if (resultSec294.next())
                sectionList.add("resultSec294");
            if (resultSec295.next())
                sectionList.add("resultSec295");
            if (resultSec296.next())
                sectionList.add("resultSec296");
            if (resultSec297.next())
                sectionList.add("resultSec297");
            if (resultSec298.next())
                sectionList.add("resultSec298");
            if (resultSec299.next())
                sectionList.add("resultSec299");
            if (resultSec300.next())
                sectionList.add("resultSec300");
            for (String result : sectionList) {
                ans += result;
                System.out.println("Result is " + result);
            }
            System.out.println();
            //System.out.println("Answer: " +result.getLiteral("k").getString()+ " "+result.getLiteral("g").getString()+" "+result.getLiteral("h")+" "+result.getLiteral("j")+" "+result.getLiteral("x")+" "+result.getLiteral("e"));
            // System.out.println("x: " + result.getLiteral("x").getInteger());

        } catch (OWLOntologyCreationException e) {
            System.err.println("Error creating OWL ontology: " + e.getMessage());
            System.exit(-1);
        } catch (SWRLParseException e) {
            System.err.println("Error parsing SWRL rule or SQWRL query: " + e.getMessage());
            System.exit(-1);
        } catch (SQWRLException e) {
            System.err.println("Error running SWRL rule or SQWRL query: " + e.getMessage());
            System.exit(-1);
        } catch (RuntimeException e) {

            System.exit(-1);
            System.err.println("Error starting application: " + e.getMessage());
        }
        return ans;
    }
}
