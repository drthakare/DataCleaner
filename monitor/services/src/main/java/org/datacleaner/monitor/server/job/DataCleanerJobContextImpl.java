/**
 * DataCleaner (community edition)
 * Copyright (C) 2014 Neopost - Customer Information Management
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.datacleaner.monitor.server.job;

import org.datacleaner.monitor.configuration.TenantContext;
import org.datacleaner.monitor.job.JobContext;
import org.datacleaner.repository.RepositoryFile;

/**
 * The {@link JobContext} implementation for DataCleaner analysis jobs. This
 * implementation caches the read analysis jobs for quick access.
 */
public class DataCleanerJobContextImpl extends AbstractDataCleanerJobContext {

    private final DataCleanerJobEngine _engine;
 

    public DataCleanerJobContextImpl(DataCleanerJobEngine engine, TenantContext tenantContext, RepositoryFile file) {
        super(tenantContext, file); 
        _engine = engine;
      
    }

    @Override
    public DataCleanerJobEngine getJobEngine() {
        return _engine;
    }

  
}
