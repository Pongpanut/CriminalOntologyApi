package OntologyRestApi;

//import org.checkerframework.checker.nullness.qual.NonNull;
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
import org.xml.sax.SAXException;

import java.io.*;
import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

import OntologyRestApi.model.ReqModel;
//import org.json.*;
//import org.swrlapi.factory.SWRLAPIFactory;
//import org.swrlapi.parser.SWRLParseException;
//import org.swrlapi.sqwrl.SQWRLQueryEngine;
//import org.swrlapi.sqwrl.SQWRLResult;
//import org.swrlapi.sqwrl.exceptions.SQWRLException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
//import org.semanticweb.owlapi.apibinding.OWLManager;
//import org.semanticweb.owlapi.model.OWLOntology;
//import org.semanticweb.owlapi.model.OWLOntologyCreationException;
//import org.semanticweb.owlapi.model.OWLOntologyManager;
//import org.swrlapi.factory.SWRLAPIFactory; 
//import org.swrlapi.parser.SWRLParseException;
//import org.swrlapi.sqwrl.SQWRLQueryEngine;
//import org.swrlapi.sqwrl.SQWRLResult;
//import org.swrlapi.sqwrl.exceptions.SQWRLException;
import javax.ws.rs.*;
import java.util.regex.Pattern;

@Path("home")
public class Resource {
String justificationStr = "";
String criminalImpunityStr = "";

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
                        ,@QueryParam("hasforeeffect") String hasforeeffect
                        ,@QueryParam("hasintact") String hasIntAct
                        ,@QueryParam("hasreaact") String hasReaAct
                        ,@QueryParam("hasreacau") String hasReaCau
                        ,@QueryParam("hasintentother") String hasIntentOther
                        ,@QueryParam("hasactheedless") String hasActHeedless
                        ,@QueryParam("hasactheedlesseng") String hasActHeedLessEng
                        ,@QueryParam("hasdanger") String hasDanger
                        ,@QueryParam("hasdangerimn") String hasDangerImn
                        ,@QueryParam("haslawfuldef") String hasLawfulDef
                        ,@QueryParam("hasdefending") String hasDefending
                        ,@QueryParam("haspureassent") String hasPureAssent
                        ,@QueryParam("hasassentgoodmoral") String hasAssentGoodMoral
                        ,@QueryParam("hasassentduringcrime") String hasAssentDuringCrime
                        ,@QueryParam("hasage") String hasAge
                        ,@QueryParam("hassit") String hasSit
                        ,@QueryParam("hasmind") String hasMind
                        ,@QueryParam("hasmentalinfirmly") String hasMentalInfirmly
                        ,@QueryParam("hasdrunk") String hasDrunk
                        ,@QueryParam("hascausedrunk") String hasCauseDrunk
                        ,@QueryParam("hasactbyofficercom") String hasActByOfficerCom
                        ,@QueryParam("hasilligalcommand") String hasIlligalCommand
                        ,@QueryParam("hasdontknowilligal") String hasDontKnowIlligal
                        ,@QueryParam("hasneedaction") String hasNeedAction
                        ,@QueryParam("hasbeforces") String hasBeForces
                        ,@QueryParam("hascannotavoid") String hasCannotAvoid
                        ,@QueryParam("hasdontneed") String hasDontNeed
                        ,@QueryParam("haslimit") String hasLimit
                        ,@QueryParam("hasprotecetd") String hasProtecetd){


        ReqModel req = new ReqModel();
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
        req.setHasAge(hasAge);
        req.setHasSit(hasSit);
        req.setHasMind(hasMind);
        req.setHasMentalInfirmly(hasMentalInfirmly);
        req.setHasDrunk(hasDrunk);
        req.setHasCauseDrunk(hasCauseDrunk);
        req.setHasBeForces(hasBeForces);
        req.setHasCannotAvoid(hasCannotAvoid);
        req.setHasDontNeed(hasDontNeed);
        req.setHasLimit(hasLimit);
        req.setHasProtecetd(hasProtecetd);
        req.setHasActByOfficerCom(hasActByOfficerCom);
        req.setHasIlligalCommand(hasIlligalCommand);
        req.setHasDontKnowIlligal(hasDontKnowIlligal);
        req.setHasNeedAction(hasNeedAction);

        // Jusification
        req.setAssent(assent);
        req.setDefending(defend);
        req.setActIsLawfulDefense(actIsLawful);
        req.setDangerToBeImminent(dangerToBeImminent);
        req.setDanger(danger);
        req.setHasDanger(hasDanger);
        req.setHasDangerImn(hasDangerImn);
        req.setHasDefending(hasDefending);
        req.setHasLawfulDef(hasLawfulDef);
        req.setHasPureAssent(hasPureAssent);
        req.setHasAssentGoodMoral(hasAssentGoodMoral);
        req.setHasAssentDuringCrime(hasAssentDuringCrime);


        // Intention
        req.setHasforeeffect(hasforeeffect);
        req.setHasintact(hasIntAct);
        req.setHasreaact(hasReaAct);
        req.setHasReaCau(hasReaCau);
        req.setHasIntentOther(hasIntentOther);
        req.setHasActHeedless(hasActHeedless);
        req.setHasActHeedlessEng(hasActHeedLessEng);

        BuildNewOWL(req);

        ArrayList<String> Ans = getData("resources/criminalcrime.properties", "ontology/destination.owl");
        String ans = "";
        for (String result : Ans) {
            ans += result;
            System.out.println("Result is " + result);
        }
        System.out.println();
        if( ans != null && ans != ""){
            return "มาตราที่เกี่ยวข้องคือ "+ ans + " " + justificationStr + " "+ criminalImpunityStr;
        }
        else{
            return "ไม่ต้องรับคามผิด เนื่องจาก " + justificationStr + " "+ criminalImpunityStr;
        }
    }


    public void BuildNewOWL(ReqModel input)
    {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //Document doc = docBuilder.parse("ontology/2309-original.owl");
            Document doc = docBuilder.parse("ontology/0210-original.owl");

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

            // intention


            // *************************
            // *************************
            //
            // Gathering intention for Victim
            //
            // *************************

            if(input.getVictim() != null) {
                victim.setAttribute("rdf:ID",input.getVictim() );
                has_victim.setAttribute("rdf:resource","#"+input.getVictim());
                with.setAttribute("rdf:resource","#"+input.getVictim());

                if (input.getVictimDetail() != null) ;
                {

                    victim.appendChild(vic_detail);
                    vic_detail.setAttribute("rdf:resource", "#"+input.getVictimDetail());
                }

                if (input.getAdditionalDetail() != null) ;
                {
                    victim.appendChild(with_add);
                    with_add.setAttribute("rdf:resource", "#"+input.getAdditionalDetail());
                    has_additional.setAttribute("rdf:resource","#"+input.getAdditionalDetail());
                    //with_add.setAttribute("rdf:resource","#Noadd");
                }
            }

            // *************************
            //
            // Gathering intention for Action
            //
            // *************************

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

            // *************************
            //
            // Gathering intention for OFFENDER
            //
            // *************************

            if(input.getOffender() != null){
                off.setAttribute("rdf:ID",input.getOffender());
                has_actor.setAttribute("rdf:resource","#"+input.getOffender());
            }

            // *************************
            //
            // Gathering Justification
            //
            // *************************

            // Defending

            String hasDanger = "";
            String hasDangerImn = "";
            String hasLawfulDef = "";
            String hasDefending = "";
            String hasAssentPure = "";
            String hasAssentDuringCrime = "";
            String hasAssentGoodMoral = "";

            if(input.getHasLawfulDef() != null) {
                hasLawfulDef = input.getHasLawfulDef();
            }
            if(input.getHasDefending() != null) {
                hasDefending = input.getHasDefending();
            }
            if(input.getHasDangerImn() != null) {
                hasDangerImn = input.getHasDangerImn();
            }
            if(input.getHasDanger() != null) {
                hasDanger = input.getHasDanger();
            }
            if(input.getHasPureAssent() != null) {
                hasAssentPure = input.getHasPureAssent();
            }
            if(input.getHasAssentDuringCrime() != null) {
                hasAssentDuringCrime = input.getHasAssentDuringCrime();
            }
            if(input.getHasAssentGoodMoral() != null) {
                hasAssentGoodMoral = input.getHasAssentGoodMoral();
            }


            ArrayList<String> hasJustification = this.findJustification(hasDanger, hasDangerImn, hasLawfulDef, hasDefending, hasAssentPure, hasAssentDuringCrime, hasAssentGoodMoral);


            String ans = "";
            int indexJust = 0;
            for (String resultTemp : hasJustification) {

                if(indexJust++ >= 1){
                    ans += ",";
                }
                if(resultTemp.equals("Justification-defending")){
                    ans += "การป้องกัน ตามประมวลกฎหมายอาญามาตรา 68";
                }
                if(resultTemp.equals("Justification-assent")){
                    ans += "การยินยอม";
                }
            }

            if(ans != "") {
                justificationStr = "เหตุยกเว้นความผิด ได้แก่ " + ans;
            }
            else {
                justificationStr = "ไม่มีเหตุยกเว้นความผิด";
            }
            System.out.println(justificationStr);
            System.out.println();

            if(hasJustification != null && hasJustification.size() > 0)  {
                con_jus.setAttribute("rdf:resource","#"     + hasJustification.get(0));
            }



            // *************************
            //
            // Gathering Criminal impunity
            //
            // *************************

            String hasAge= "";
            String hasSit= "";
            String hasMind= "";
            String hasMentalInfirmly= "";
            String hasDrunk= "";
            String hasCauseDrunk= "";
            String hasBeForces= "";
            String hasCannotAvoid= "";
            String hasDontNeed= "";
            String hasLimit= "";
            String hasProtecetd= "";
            String hasActByOfficerCom= "";
            String hasIlligalCommand= "";
            String hasDontKnowIlligal= "";
            String hasNeedAction = "" ;


            if(input.getHasAge() != null) {
                hasAge = input.getHasAge();
            }
            if(input.getHasSit() != null) {
                hasSit = input.getHasSit();
            }
            if(input.getHasMind() != null) {
                hasMind = input.getHasMind();
            }
            if(input.getHasMentalInfirmly() != null) {
                hasMentalInfirmly = input.getHasMentalInfirmly();
            }
            if(input.getHasDrunk() != null) {
                hasDrunk = input.getHasDrunk();
            }
            if(input.getHasCauseDrunk() != null) {
                hasCauseDrunk = input.getHasCauseDrunk();
            }
            if(input.getHasBeForces() != null) {
                hasBeForces = input.getHasBeForces();
            }
            if(input.getHasCannotAvoid() != null) {
                hasCannotAvoid = input.getHasCannotAvoid();
            }
            if(input.getHasDontNeed() != null) {
                hasDontNeed = input.getHasDontNeed();
            }
            if(input.getHasLimit() != null) {
                hasLimit = input.getHasLimit();
            }
            if(input.getHasProtecetd() != null) {
                hasProtecetd = input.getHasProtecetd();
            }
            if(input.getHasActByOfficerCom() != null) {
                hasActByOfficerCom = input.getHasActByOfficerCom();
            }
            if(input.getHasIlligalCommand() != null) {
                hasIlligalCommand = input.getHasIlligalCommand();
            }
            if(input.getHasNeedAction() != null) {
                hasNeedAction = input.getHasNeedAction();
            }
            if(input.getHasDontKnowIlligal() != null) {
                hasDontKnowIlligal = input.getHasDontKnowIlligal();
            }


            ArrayList<String> hasCriminalImpunity = this.findCriminalImpunity(hasAge, hasSit , hasMind, hasMentalInfirmly, hasDrunk, hasCauseDrunk,
                    hasActByOfficerCom, hasIlligalCommand, hasDontKnowIlligal, hasNeedAction, hasBeForces,
                    hasCannotAvoid, hasDontNeed, hasLimit, hasProtecetd);


            String ansCri = "";
            int indexCri = 0;
            for (String resultTemp : hasCriminalImpunity) {

                if(indexCri++ > 1){
                    ansCri += ",";
                }
                if(resultTemp.equals("Cri_Necessity")){
                    ansCri += "ความจำเป็น ตามประมวลกฎหมายอาญามาตรา 67";
                }
                if(resultTemp.equals("Cri_Actdonebyorder")){
                    ansCri += "การความผิดตามคำสั่งที่มิชอบด้วยกฎหมายของเจ้าพนักงาน ตามประมวลกฎหมายอาญามาตรา 70";
                }
                if(resultTemp.equals("Cri_ChildNotYetOverFiftheen")){
                    ansCri += "อายุผู้กระทำความผิดน้อยกว่า 15 ปี  ตามประมวลกฎหมายอาญามาตรา 73,74";
                }
                if(resultTemp.equals("Cri_Intoxication")){
                    ansCri += "การกระทำของผู้มึนเมา ตามประมวลกฎหมายอาญามาตรา 66";
                }
                if(resultTemp.equals("Cri_MentalInfirmly")){
                    ansCri += "การกระทำของคนวิกลจริต ตามประมวลกฎหมายอาญามาตรา 66";
                }
            }
            if(ansCri != "") {
                criminalImpunityStr = "เหตุยกเว้นโทษ ได้แก่ " + ansCri;
            }
            else {
                criminalImpunityStr = "ไม่มีเหตุยกเว้นโทษ";
            }

            System.out.println(criminalImpunityStr);
            System.out.println();


            if(hasCriminalImpunity != null && hasCriminalImpunity.size() > 0)  {
                con_cri_im.setAttribute("rdf:resource","#"     + hasCriminalImpunity.get(0));
            }

            // *************************
            //
            // Gathering intention for subjective of element
            //
            // *************************

            String hasintact = "";
            String hasforeeffect = "";
            String hasreaact = "";
            String hasReaCau = "";
            String hasIntentOther = "";
            String hasActHeedless = "";
            String hasActHeedlessEng = "";
            if(input.getHasforeeffect() != null) {
                hasforeeffect = input.getHasforeeffect();
            }
            if(input.getHasintact() != null) {
                hasintact = input.getHasintact();
            }
            if(input.getHasreaact() != null) {
                hasreaact = input.getHasreaact();
            }
            if(input.getHasReaCau() != null) {
                hasReaCau = input.getHasReaCau();
            }
            if(input.getHasIntentOther() != null) {
                hasIntentOther = input.getHasIntentOther();
            }
            if(input.getHasActHeedless() != null) {
                hasActHeedlessEng = input.getHasActHeedless();
            }
            if(input.getHasActHeedlessEng() != null) {
                hasActHeedlessEng = input.getHasActHeedlessEng();
            }

            String hasIntention = this.findIntention(hasintact,hasforeeffect, hasreaact ,hasReaCau,hasActHeedless,hasActHeedlessEng ,hasIntentOther);

            System.out.println(hasIntention);


            if(hasIntention == "intentionx"){
                has_sub.setAttribute("rdf:resource","#Intentionx");
                rwse.setAttribute("rdf:resource","#Intentionx");
            }
            else if (hasIntention == "Negligence"){
                has_sub.setAttribute("rdf:resource","#Negli_intention");
                rwse.setAttribute("rdf:resource","#Negli_intention");
            }
            else if (hasIntention == "No intention"){
                has_sub.setAttribute("rdf:resource","#No_Intention_obj");
                rwse.setAttribute("rdf:resource","#No_Intention_obj");
            }


            // *************************
            //
            // Gathering Objective element
            //
            // *************************


            //OBJECTIVE ELEMENT
            has_obj.setAttribute("rdf:resource","#ObjElem");
            obj_elem.setAttribute("rdf:ID","ObjElem");


            obj_elem.appendChild(has_actor);
            obj_elem.appendChild(has_action);
            obj_elem.appendChild(has_victim);
            obj_elem.appendChild(has_additional);
            obj_elem.appendChild(rwse);

            // *************************
            //
            // Gathering Element of crime
            //
            // *************************

            eoc.setAttribute("rdf:ID","eoc");

            if(input.getNoCriminalImpunity() != null){
                con_cri_im.setAttribute("rdf:resource","#"+input.getNoCriminalImpunity());
            }

            if(input.getCausation() != null){
                has_cau.setAttribute("rdf:resource","#"+input.getCausation() );
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

    public String findIntention( String hasintact,String hasforeeffect,String  hasreaact ,String hasReaCau,String hasActHeedless,String hasActHeedlessEng ,String hasIntentOther){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse("ontology/0210-original.owl");

            Element obj_elem = doc.createElement("ObjectiveElement");
            Element has_fore_effect = doc.createElement("has_fore_effect");
            Element has_int_act = doc.createElement("has_int_act");
            Element has_rea_act = doc.createElement("has_rea_act");
            Element has_rea_cau = doc.createElement("has_rea_cau");
            Element has_act_heedless = doc.createElement("has_act_heedless");
            Element has_act_heedless_eng = doc.createElement("has_act_heedless_eng");
            Element has_intent_other = doc.createElement("has_intent_other");

            obj_elem.setAttribute("rdf:ID","ObjElem");

            if(hasintact != "")
                has_int_act.setAttribute("rdf:resource","#"+hasintact);
            if(hasforeeffect != "")
                has_fore_effect.setAttribute("rdf:resource","#"+hasforeeffect);
            if(hasreaact != "")
                has_rea_act.setAttribute("rdf:resource","#"+hasreaact);
            if(hasReaCau != "")
                has_rea_cau.setAttribute("rdf:resource","#"+hasReaCau);
            if(hasActHeedless != "")
                has_act_heedless.setAttribute("rdf:resource","#"+hasActHeedless);
            if(hasActHeedlessEng != "")
                has_act_heedless_eng.setAttribute("rdf:resource","#"+hasActHeedlessEng);
            if(hasIntentOther != "")
                has_intent_other.setAttribute("rdf:resource","#"+hasIntentOther);

            obj_elem.appendChild(has_fore_effect);
            obj_elem.appendChild(has_int_act);
            obj_elem.appendChild(has_rea_act);
            obj_elem.appendChild(has_rea_cau);
            obj_elem.appendChild(has_act_heedless);
            obj_elem.appendChild(has_act_heedless_eng);
            obj_elem.appendChild(has_intent_other);

            Node rootNode = doc.getElementsByTagName("rdf:RDF").item(0);
            rootNode.appendChild(obj_elem);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ontology/intention.owl"));
            transformer.transform(source, result);

            try {
                OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
                OWLOntology ontology2 = ontologyManager.loadOntologyFromOntologyDocument(new File("ontology/intention.owl"));

                // Create SQWRL query engine using the SWRLAPI
                SQWRLQueryEngine queryEngine = SWRLAPIFactory.createSQWRLQueryEngine(ontology2);

                queryEngine.createSQWRLQuery("Intention-act","has_rea_act(?x, ?a) ^ has_rea_cau(?x, ?b) ^ has_int_act(?x, ?c) ^ sameAs(?e, Intentionx) ^ Intention(Intentionx) ->  sqwrl:select(?x, ?e)");
                queryEngine.createSQWRLQuery("Intention-foreseen","has_rea_act(?x, ?a) ^ has_rea_cau(?x, ?b) ^ has_fore_effect(?x, ?d) ^ sameAs(?e, Intentionx) ^ Intention(Intentionx) ->  sqwrl:select(?x,?e)");
                queryEngine.createSQWRLQuery("Negligence1","has_act_heedless_eng(?x, ?b) ^ sameAs(?e, Negli_intention) ^ Negligence(Negli_intention)->  sqwrl:select(?x, ?b)");
                queryEngine.createSQWRLQuery("Negligence2","has_act_heedless(?x, ?a) ^ sameAs(?e, Negli_intention) ^ Negligence(Negli_intention)->  sqwrl:select(?x, ?a)");
                queryEngine.createSQWRLQuery("transfer-intent","has_intent_other(?x,?c) ^ sameAs(?e, Intentionx) ^ Intention(Intentionx) ->  sqwrl:select(?x, ?e)");
                SQWRLResult Intention = queryEngine.runSQWRLQuery("Intention-act");
                SQWRLResult foreseen = queryEngine.runSQWRLQuery("Intention-foreseen");

                if (Intention.next() || foreseen.next()) {
                    SQWRLResult transferIntentIntact = queryEngine.runSQWRLQuery("transfer-intent");
                    if (transferIntentIntact.next())
                        return "TransferIntent";
                     else
                        return "intentionx";
                }

                if(!Intention.next() && !foreseen.next()) {
                    SQWRLResult negligence1 = queryEngine.runSQWRLQuery("Negligence1");
                    SQWRLResult negligence2 = queryEngine.runSQWRLQuery("Negligence2");
                    if(negligence1.next() || negligence2.next())
                        return "Negligence";
                }


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

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
        return "No intention";
    }

    public ArrayList<String> findJustification(String hasDanger, String  hasDangerImn , String hasLawfulDef, String hasDefending, String hasAssentPure, String hasAssentDuringCrime, String hasAssentGoodMoral){
        ArrayList<String> resultArr = new ArrayList<String>();
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse("ontology/0210-original.owl");

            Element def_elem = doc.createElement("Defending");
            Element consider_justification = doc.createElement("consider_justification");
            Element has_danger = doc.createElement("has_danger");
            Element has_danger_imn = doc.createElement("has_danger_imn");
            Element has_lawful_def = doc.createElement("has_lawful_def");
            Element has_defending = doc.createElement("has_defending");

            Element has_pure_assent = doc.createElement("has_pure_assent");
            Element has_assent_during_crime = doc.createElement("has_assent_during_crime");
            Element has_assent_good_moral = doc.createElement("has_assent_good_moral");

            def_elem.setAttribute("rdf:ID","Defending_Obj");
            consider_justification.setAttribute("rdf:resource","#Defending_Obj");

            if(hasDanger != "")
                has_danger.setAttribute("rdf:resource","#"+hasDanger);
            if(hasDangerImn != "")
                has_danger_imn.setAttribute("rdf:resource","#"+hasDangerImn);
            if(hasLawfulDef != "")
                has_lawful_def.setAttribute("rdf:resource","#"+hasLawfulDef);
            if(hasDefending != "")
                has_defending.setAttribute("rdf:resource","#"+hasDefending);
            if(hasAssentPure != "")
                has_pure_assent.setAttribute("rdf:resource","#"+hasAssentPure);
            if(hasAssentDuringCrime != "")
                has_assent_during_crime.setAttribute("rdf:resource","#"+hasAssentDuringCrime);
            if(hasAssentGoodMoral != "")
                has_assent_good_moral.setAttribute("rdf:resource","#"+hasAssentGoodMoral);

            def_elem.appendChild(has_danger);
            def_elem.appendChild(has_danger_imn);
            def_elem.appendChild(has_lawful_def);
            def_elem.appendChild(has_defending);
            def_elem.appendChild(has_pure_assent);
            def_elem.appendChild(has_assent_during_crime);
            def_elem.appendChild(has_assent_good_moral);

            // Adhoc
            Element eoc = doc.createElement("ElementOfCrime");
            eoc.setAttribute("rdf:ID","eoc");
            eoc.appendChild(consider_justification);

            Node rootNode = doc.getElementsByTagName("rdf:RDF").item(0);
            rootNode.appendChild(def_elem);
            rootNode.appendChild(eoc);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ontology/justification-defending.owl"));
            transformer.transform(source, result);

            resultArr = getData("resources/justification.properties","ontology/justification-defending.owl");
            if(resultArr.size() == 0 )
                resultArr.add("No_just");



        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
        return resultArr;
    }


    public  ArrayList<String> findCriminalImpunity(String hasAge, String hasSit , String hasMind, String hasMentalInfirmly, String hasDrunk, String hasCauseDrunk,
                                       String hasActByOfficerCom, String hasIlligalCommand, String hasDontKnowIlligal, String hasNeedAction, String hasBeForces,
                                       String hasCannotAvoid, String hasDontNeed, String hasLimit, String hasProtecetd){
        ArrayList<String> resultArr = new ArrayList<String>();
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse("ontology/0210-original.owl");

            Element LessThanFifthteenYears_elem = doc.createElement("LessThanFifthteenYears");
            Element Intoxication_elem = doc.createElement("Intoxication");
            Element Necessity_elem = doc.createElement("Necessity");
            Element ActWithOrder_elem = doc.createElement("ActWithOrder");
            Element MentalInfirmly_elem = doc.createElement("MentalInfirmly");


            Element has_age = doc.createElement("has_age");
            Element has_sit = doc.createElement("has_sit");
            Element has_mind = doc.createElement("has_mind");
            Element has_sit2 = doc.createElement("has_sit");
            Element has_mind2 = doc.createElement("has_mind");
            Element has_mental_infirmly = doc.createElement("has_mental_infirmly");
            Element has_drunk = doc.createElement("has_drunk");
            Element has_cause_drunk = doc.createElement("has_cause_drunk");

            Element has_be_forces = doc.createElement("has_be_forces");
            Element has_cannot_avoid = doc.createElement("has_cannot_avoid");
            Element has_dont_need = doc.createElement("has_dont_need");
            Element has_limit = doc.createElement("has_limit");
            Element has_protecetd = doc.createElement("has_protecetd");

            Element has_need_action = doc.createElement("has_need_action");
            Element has_dont_know_illigal = doc.createElement("has_dont_know_illigal");
            Element has_illigal_command = doc.createElement("has_illigal_command");
            Element has_act_by_officer_com = doc.createElement("has_act_by_officer_com");


            LessThanFifthteenYears_elem.setAttribute("rdf:ID","LessThanFifthteenYears_ins");
            Intoxication_elem.setAttribute("rdf:ID","Intoxication_ins");
            Necessity_elem.setAttribute("rdf:ID","Necessity_ins");
            ActWithOrder_elem.setAttribute("rdf:ID","ActWithOrder_ins");
            MentalInfirmly_elem.setAttribute("rdf:ID","MentalInfirmly_ins");

            if(hasAge != "")
                has_age.setAttribute("rdf:resource","#"+hasAge);
            if(hasSit != "") {
                has_sit.setAttribute("rdf:resource", "#" + hasSit);
                has_sit2.setAttribute("rdf:resource", "#" + hasSit);
            }
            if(hasMind != "") {
                has_mind.setAttribute("rdf:resource", "#" + hasMind);
                has_mind2.setAttribute("rdf:resource", "#" + hasMind);
            }
            if(hasMentalInfirmly != "")
                has_mental_infirmly.setAttribute("rdf:resource","#"+hasMentalInfirmly);
            if(hasDrunk != "")
                has_drunk.setAttribute("rdf:resource","#"+hasDrunk);
            if(hasCauseDrunk != "")
                has_cause_drunk.setAttribute("rdf:resource","#"+hasCauseDrunk);
            if(hasBeForces != "")
                has_be_forces.setAttribute("rdf:resource","#"+hasBeForces);
            if(hasCannotAvoid != "")
                has_cannot_avoid.setAttribute("rdf:resource","#"+hasCannotAvoid);
            if(hasDontNeed != "")
                has_dont_need.setAttribute("rdf:resource","#"+hasDontNeed);
            if(hasLimit != "")
                has_limit.setAttribute("rdf:resource","#"+hasLimit);
            if(hasProtecetd != "")
                has_protecetd.setAttribute("rdf:resource","#"+hasProtecetd);
            if(hasNeedAction != "")
                has_need_action.setAttribute("rdf:resource","#"+hasNeedAction);
            if(hasDontKnowIlligal != "")
                has_dont_know_illigal.setAttribute("rdf:resource","#"+hasDontKnowIlligal);
            if(hasIlligalCommand != "")
                has_illigal_command.setAttribute("rdf:resource","#"+hasIlligalCommand);
            if(hasActByOfficerCom != "")
                has_act_by_officer_com.setAttribute("rdf:resource","#"+hasActByOfficerCom);

            LessThanFifthteenYears_elem.appendChild(has_age);

            MentalInfirmly_elem.appendChild(has_sit2);
            MentalInfirmly_elem.appendChild(has_mind2);
            MentalInfirmly_elem.appendChild(has_mental_infirmly);

            Intoxication_elem.appendChild(has_sit);
            Intoxication_elem.appendChild(has_mind);
            Intoxication_elem.appendChild(has_drunk);
            Intoxication_elem.appendChild(has_cause_drunk);

            Necessity_elem.appendChild(has_be_forces);
            Necessity_elem.appendChild(has_cannot_avoid);
            Necessity_elem.appendChild(has_dont_need);
            Necessity_elem.appendChild(has_limit);
            Necessity_elem.appendChild(has_protecetd);

            ActWithOrder_elem.appendChild(has_act_by_officer_com);
            ActWithOrder_elem.appendChild(has_illigal_command);
            ActWithOrder_elem.appendChild(has_dont_know_illigal);
            ActWithOrder_elem.appendChild(has_need_action);

            Node rootNode = doc.getElementsByTagName("rdf:RDF").item(0);
            rootNode.appendChild(LessThanFifthteenYears_elem);
            rootNode.appendChild(MentalInfirmly_elem);
            rootNode.appendChild(Intoxication_elem);
            rootNode.appendChild(Necessity_elem);
            rootNode.appendChild(ActWithOrder_elem);


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ontology/criminal_impunity.owl"));
            transformer.transform(source, result);

            resultArr = getData("resources/criminalimpunity.properties","ontology/criminal_impunity.owl");
            if(resultArr.size() == 0 )
                resultArr.add("NoCriminalImpunity_ins");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
        return resultArr;
    }


//    public static List<String> getPropertyList(Properties properties, String name)
//    {
//        List<String> result = new ArrayList<String>();
//        for (Map.Entry<Object, Object> entry : properties.entrySet())
//        {
//            if (((String)entry.getKey()).matches("^" + Pattern.quote(name) + "\\.\\d+$"))
//            {
//                result.add((String) entry.getValue());
//            }
//        }
//        return result;
//    }

    public Map<String, String> extractProperties(String pathName ){
        Map<String, String> result = null;
        try{
            Properties props = new Properties();
            props.load(new FileInputStream(pathName));

            result = (Map)props;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return result;
    }


    public  ArrayList<String>  getData(String propName, String source) {
        Map<String, String> map =  extractProperties(propName);
        List keys = new ArrayList(map.keySet());
        List values = new ArrayList(map.values());
        ArrayList<String> sectionList = new ArrayList<String>();

        String ans = "";
        try {
            // Create an OWL ontology using the OWLAPI
            OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
            OWLOntology ontology = ontologyManager.loadOntologyFromOntologyDocument(new File(source));

            // Create SQWRL query engine using the SWRLAPI
            SQWRLQueryEngine queryEngine = SWRLAPIFactory.createSQWRLQueryEngine(ontology);

            for (int i = 0; i < map.size(); i++) {
                String key =  keys.get(i).toString();
                String value = values.get(i).toString();
                queryEngine.createSQWRLQuery(key,value);
                SQWRLResult result = queryEngine.runSQWRLQuery(key);
                if(result.next()){
                    sectionList.add(key);
                }
            }

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
        return sectionList;
    }
}
