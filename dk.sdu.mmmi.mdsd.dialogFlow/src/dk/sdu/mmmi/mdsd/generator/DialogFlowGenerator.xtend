/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem
import dk.sdu.mmmi.mdsd.dialogFlow.SystemList
import dk.sdu.mmmi.mdsd.dialogFlow.Entity
import dk.sdu.mmmi.mdsd.dialogFlow.Intent

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DialogFlowGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//var systemList = resource.allContents.filter(SystemList).next
		
		
		
		for(currentSystem: resource.allContents.toIterable.filter(DialogFlowSystem)){
			val baseSystem = currentSystem
			println(baseSystem.name)
			
			val decl = currentSystem.declarations
			
			
			
			
			

			val rootElementCreator = new RootElementCreator(baseSystem.name)
			rootElementCreator.generateElements(baseSystem, fsa)
			
			val entityCreator = new EntityCreator(baseSystem.name)
			//for (e: resource.allContents.toIterable.filter(Entity)) {
			//	entityCreator.generateEntity(e, fsa)
			//}
	
			val intentCreator = new IntentCreator(baseSystem.name)
			//for (i: resource.allContents.toIterable.filter(Intent)) {
			//	intentCreator.generateIntent(i, fsa)
			//}
			
			for (i : 0 ..< decl.size) {
				val element = decl.get(i)
				println(element instanceof Entity)
				if(element instanceof Entity) {
					entityCreator.generateEntity(element, fsa)
				} else if(element instanceof Intent) {
					intentCreator.generateIntent(element, fsa)
				}
			}
		
		}
		
	}
}
