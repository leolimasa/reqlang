/*
* generated by Xtext
*/
package com.leo_sa;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ReqLangStandaloneSetup extends ReqLangStandaloneSetupGenerated{

	public static void doSetup() {
		new ReqLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

