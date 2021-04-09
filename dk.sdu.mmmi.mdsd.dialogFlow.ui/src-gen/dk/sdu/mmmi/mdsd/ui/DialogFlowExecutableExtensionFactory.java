/*
 * generated by Xtext 2.24.0
 */
package dk.sdu.mmmi.mdsd.ui;

import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.dialogFlow.ui.internal.DialogFlowActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DialogFlowExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DialogFlowActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DialogFlowActivator activator = DialogFlowActivator.getInstance();
		return activator != null ? activator.getInjector(DialogFlowActivator.DK_SDU_MMMI_MDSD_DIALOGFLOW) : null;
	}

}
