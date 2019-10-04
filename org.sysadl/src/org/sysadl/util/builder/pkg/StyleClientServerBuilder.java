package org.sysadl.util.builder.pkg;

import org.sysadl.AbstractComponentDef;
import org.sysadl.Invariant;
import org.sysadl.Style;

public class StyleClientServerBuilder extends ElementBuilder {

	@Override
	public Style build() {
		Style clientServer = factory.createStyle();
		clientServer.setName("ClientServer");

		// types
		AbstractComponentDef client = factory.createAbstractComponentDef();
		client.setName("AClient");
		AbstractComponentDef server = factory.createAbstractComponentDef();
		server.setName("AServer");

		// constraints
		Invariant clientConnectToServer = factory.createInvariant();
		clientConnectToServer.setName("ClientMustConnectToServer");
		clientConnectToServer.setExpr("self.ExistsConnectionForAll('AClient', 'AServer')");

		Invariant clientShouldntConnectToClient = factory.createInvariant();
		clientShouldntConnectToClient.setName("ClientShouldntConnectToClient");
		clientShouldntConnectToClient.setExpr("not(self.ExistsConnection('AClient', 'AClient'))");

		clientServer.getDefinitions().add(client);
		clientServer.getDefinitions().add(server);
		clientServer.getInvariants().add(clientConnectToServer);
		clientServer.getInvariants().add(clientShouldntConnectToClient);
		return clientServer;
	}

}
