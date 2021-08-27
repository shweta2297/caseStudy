/*
 * package readMsg;
 * 
 * public class ReadOTPFromOutlook {
 * 
 * //public static void main(String[] args) { public static String
 * getTemproryPassword() throws Exception{
 * 
 * String VerificationPassword=null;
 * 
 * ReportLog.setTestStep("Retrive Temporary Password");
 * EmailPage.email.verificationPassword.waitForDisplay(true, 30);
 * EmailPage.email.verificationPassword.veryFyDisplayed();
 * 
 * VerificationPassword=EmailPage.email.getText();
 * VerificationPassword=VerificationPassword.replaceAll("[^0-9]", "");
 * System.out.println(VerificationPassword);
 * if(VerificationPassword.substring(0,
 * 2).equalsIgnoreCase(VerificationPassword)) {
 * VerificationPassword=VerificationPassword.substring(2);
 * System.out.println("password is:"+VerificationPassword); }
 * ReportLog.getInf("VerificationPassword" + VerificationPassword); return
 * VerificationPassword;
 * 
 * 
 * }
 * 
 * 
 * }
 */