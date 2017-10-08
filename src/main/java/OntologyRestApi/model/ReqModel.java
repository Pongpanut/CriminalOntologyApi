package OntologyRestApi.model;

public class ReqModel {
    private String offender;
    private String party;
    private String innocent;
    private String relationWithVictim;
    private String attemp;
    private String committed;
    private String crimeSucceed;
    private String makingDecision;
    private String preparing;
    private String considering;
    private String victim;
    private String victimDetail;
    private String additionalDetail;
    private String causation;

    // Criminal Impunity
    private String noCriminalImpunity;
    private String entrapmentWithOfficer;
    private String committedBySpourse;
    private String actAccordanceWithTheOrder;
    private String intoxication;
    private String mentalInfirmly;
    private String child;
    private String necessity;
    private String hasAge;
    private String hasSit;
    private String hasMind;
    private String hasMentalInfirmly;
    private String hasDrunk;
    private String hasCauseDrunk;
    private String hasActByOfficerCom;
    private String hasIlligalCommand;
    private String hasDontKnowIlligal;
    private String hasNeedAction;
    private String hasBeForces;
    private String hasCannotAvoid;
    private String hasDontNeed;
    private String hasLimit;
    private String hasProtecetd;

    // Jusification
    ////  Defending
    private String assent;
    private String defending;
    private String actIsLawfulDefense;
    private String dangerToBeImminent;
    private String danger;
    private String hasDanger;
    private String hasDangerImn;
    private String hasLawfulDef;
    private String hasDefending;
    ////  Assent
    private String hasPureAssent;
    private String hasAssentGoodMoral;
    private String hasAssentDuringCrime;

    // Intention
    private String hasforeeffect;
    private String hasintact;
    private String hasreaact;
    private String hasReaCau;
    private String hasIntentOther;
    private String hasActHeedless;
    private String hasActHeedlessEng;



    public  String getHasPureAssent() {
        return hasPureAssent;
    }
    public void   setHasPureAssent(String hasPureAssent) {
        this.hasPureAssent = hasPureAssent;
    }
    public String getHasAssentGoodMoral() {
        return hasAssentGoodMoral;
    }
    public void   setHasAssentGoodMoral(String hasAssentGoodMoral) {
        this.hasAssentGoodMoral = hasAssentGoodMoral;
    }
    public String getHasAssentDuringCrime() {
        return hasAssentDuringCrime;
    }
    public void   setHasAssentDuringCrime(String hasAssentDuringCrime) {
        this.hasAssentDuringCrime = hasAssentDuringCrime;
    }


    public String getHasCauseDrunk() {
        return hasCauseDrunk;
    }

    public void setHasCauseDrunk(String hasCauseDrunk) {
        this.hasCauseDrunk = hasCauseDrunk;
    }
    public String getHasAge() {
        return hasAge;
    }

    public void setHasAge(String hasAge) {
        this.hasAge = hasAge;
    }

    public String getHasSit() {
        return hasSit;
    }

    public void setHasSit(String hasSit) {
        this.hasSit = hasSit;
    }

    public String getHasMind() {
        return hasMind;
    }

    public void setHasMind(String hasMind) {
        this.hasMind = hasMind;
    }

    public String getHasMentalInfirmly() {
        return hasMentalInfirmly;
    }

    public void setHasMentalInfirmly(String hasMentalInfirmly) {
        this.hasMentalInfirmly = hasMentalInfirmly;
    }

    public String getHasDrunk() {
        return hasDrunk;
    }

    public void setHasDrunk(String hasDrunk) {
        this.hasDrunk = hasDrunk;
    }

    public String getHasActByOfficerCom() {
        return hasActByOfficerCom;
    }

    public void setHasActByOfficerCom(String hasActByOfficerCom) {
        this.hasActByOfficerCom = hasActByOfficerCom;
    }

    public String getHasIlligalCommand() {
        return hasIlligalCommand;
    }

    public void setHasIlligalCommand(String hasIlligalCommand) {
        this.hasIlligalCommand = hasIlligalCommand;
    }

    public String getHasDontKnowIlligal() {
        return hasDontKnowIlligal;
    }

    public void setHasDontKnowIlligal(String hasDontKnowIlligal) {
        this.hasDontKnowIlligal = hasDontKnowIlligal;
    }

    public String getHasNeedAction() {
        return hasNeedAction;
    }

    public void setHasNeedAction(String hasNeedAction) {
        this.hasNeedAction = hasNeedAction;
    }

    public String getHasBeForces() {
        return hasBeForces;
    }

    public void setHasBeForces(String hasBeForces) {
        this.hasBeForces = hasBeForces;
    }

    public String getHasCannotAvoid() {
        return hasCannotAvoid;
    }

    public void setHasCannotAvoid(String hasCannotAvoid) {
        this.hasCannotAvoid = hasCannotAvoid;
    }

    public String getHasDontNeed() {
        return hasDontNeed;
    }

    public void setHasDontNeed(String hasDontNeed) {
        this.hasDontNeed = hasDontNeed;
    }

    public String getHasLimit() {
        return hasLimit;
    }

    public void setHasLimit(String hasLimit) {
        this.hasLimit = hasLimit;
    }

    public String getHasProtecetd() {
        return hasProtecetd;
    }

    public void setHasProtecetd(String hasProtecetd) {
        this.hasProtecetd = hasProtecetd;
    }


    public String getHasDanger() {
        return hasDanger;
    }

    public void setHasDanger(String hasDanger) {
        this.hasDanger = hasDanger;
    }

    public String getHasDangerImn() {
        return hasDangerImn;
    }

    public void setHasDangerImn(String hasDangerImn) {
        this.hasDangerImn = hasDangerImn;
    }

    public String getHasLawfulDef() {
        return hasLawfulDef;
    }

    public void setHasLawfulDef(String hasLawfulDef) {
        this.hasLawfulDef = hasLawfulDef;
    }

    public String getHasDefending() {
        return hasDefending;
    }

    public void setHasDefending(String hasDefending) {
        this.hasDefending = hasDefending;
    }


    public String getHasIntentOther() {
        return hasIntentOther;
    }

    public void setHasIntentOther(String hasIntentOther) {
        this.hasIntentOther = hasIntentOther;
    }

    public String getHasActHeedless() {
        return hasActHeedless;
    }

    public void setHasActHeedless(String hasActHeedless) {
        this.hasActHeedless = hasActHeedless;
    }

    public String getHasActHeedlessEng() {
        return hasActHeedlessEng;
    }

    public void setHasActHeedlessEng(String hasActHeedlessEng) {
        this.hasActHeedlessEng = hasActHeedlessEng;
    }

    public  String getHasforeeffect() {
        return hasforeeffect;
    }

    public void  setHasforeeffect(String hasforeeffect) {
        this.hasforeeffect = hasforeeffect;
    }
    public String getHasintact() {
        return hasintact;
    }
    public void   setHasintact(String hasintact) {
        this.hasintact = hasintact;
    }
    public String getHasreaact() {
        return hasreaact;
    }
    public void   setHasreaact(String hasreaact) {
        this.hasreaact = hasreaact;
    }
    public String getHasReaCau() {
        return hasReaCau;
    }
    public void   setHasReaCau(String hasReaCau) {
        this.hasReaCau = hasReaCau;
    }


    public String getOffender() {
        return offender;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getInnocent() {
        return innocent;
    }

    public void setInnocent(String innocent) {
        this.innocent = innocent;
    }

    public String getRelationWithVictim() {
        return relationWithVictim;
    }

    public void setRelationWithVictim(String relationWithVictim) {
        this.relationWithVictim = relationWithVictim;
    }

    public String getAttemp() {
        return attemp;
    }

    public void setAttemp(String attemp) {
        this.attemp = attemp;
    }

    public String getCommitted() {
        return committed;
    }

    public void setCommitted(String committed) {
        this.committed = committed;
    }

    public String getCrimeSucceed() {
        return crimeSucceed;
    }

    public void setCrimeSucceed(String crimeSucceed) {
        this.crimeSucceed = crimeSucceed;
    }

    public String getMakingDecision() {
        return makingDecision;
    }

    public void setMakingDecision(String makingDecision) {
        this.makingDecision = makingDecision;
    }

    public String getPreparing() {
        return preparing;
    }

    public void setPreparing(String preparing) {
        this.preparing = preparing;
    }

    public String getConsidering() {
        return considering;
    }

    public void setConsidering(String considering) {
        this.considering = considering;
    }

    public String getVictim() {
        return victim;
    }

    public void setVictim(String victim) {
        this.victim = victim;
    }

    public String getVictimDetail() {
        return victimDetail;
    }

    public void setVictimDetail(String victimDetail) {
        this.victimDetail = victimDetail;
    }

    public String getAdditionalDetail() {
        return additionalDetail;
    }

    public void setAdditionalDetail(String additionalDetail) {
        this.additionalDetail = additionalDetail;
    }

    public String getCausation() {
        return causation;
    }

    public void setCausation(String causation) {
        this.causation = causation;
    }

    public String getNoCriminalImpunity() {
        return noCriminalImpunity;
    }

    public void setNoCriminalImpunity(String noCriminalImpunity) {
        this.noCriminalImpunity = noCriminalImpunity;
    }

    public String getEntrapmentWithOfficer() {
        return entrapmentWithOfficer;
    }

    public void setEntrapmentWithOfficer(String entrapmentWithOfficer) {
        this.entrapmentWithOfficer = entrapmentWithOfficer;
    }

    public String getCommittedBySpourse() {
        return committedBySpourse;
    }

    public void setCommittedBySpourse(String committedBySpourse) {
        this.committedBySpourse = committedBySpourse;
    }

    public String getActAccordanceWithTheOrder() {
        return actAccordanceWithTheOrder;
    }

    public void setActAccordanceWithTheOrder(String actAccordanceWithTheOrder) {
        this.actAccordanceWithTheOrder = actAccordanceWithTheOrder;
    }

    public String getIntoxication() {
        return intoxication;
    }

    public void setIntoxication(String intoxication) {
        this.intoxication = intoxication;
    }

    public String getMentalInfirmly() {
        return mentalInfirmly;
    }

    public void setMentalInfirmly(String mentalInfirmly) {
        this.mentalInfirmly = mentalInfirmly;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getNecessity() {
        return necessity;
    }

    public void setNecessity(String necessity) {
        this.necessity = necessity;
    }

    public String getAssent() {
        return assent;
    }

    public void setAssent(String assent) {
        this.assent = assent;
    }

    public String getDefending() {
        return defending;
    }

    public void setDefending(String defending) {
        this.defending = defending;
    }

    public String getActIsLawfulDefense() {
        return actIsLawfulDefense;
    }

    public void setActIsLawfulDefense(String actIsLawfulDefense) {
        this.actIsLawfulDefense = actIsLawfulDefense;
    }

    public String getDangerToBeImminent() {
        return dangerToBeImminent;
    }

    public void setDangerToBeImminent(String dangerToBeImminent) {
        this.dangerToBeImminent = dangerToBeImminent;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }
}
