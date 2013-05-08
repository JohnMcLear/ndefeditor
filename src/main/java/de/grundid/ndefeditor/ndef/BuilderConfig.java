/**
 * This file is part of NFC Tools Applet.
 * Copyright (c) 2012 by Adrian Stabiszewski, as@grundid.de
 *
 * Relation Analyzer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Relation Analyzer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Relation Analyzer.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.grundid.ndefeditor.ndef;

import java.util.ArrayList;
import java.util.List;

public class BuilderConfig {

	private static NdefBuilderService builderService;

	public static NdefBuilderService getBuilderServiceInstance() {
		if (builderService == null) {
			List<Builder> builders = new ArrayList<Builder>();
			builders.add(new TextRecordBuilder());
			builders.add(new UriRecordBuilder());
			builders.add(new SmartPosterRecordBuilder());
			builders.add(new AndroidApplicationRecordBuilder());
			builders.add(new MimeRecordBuilder());
			builderService = new NdefBuilderService(builders);

		}
		return builderService;
	}
}