/*
 * Copyright (c) 2013-2015 Cinchapi Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cinchapi.concourse;

import org.cinchapi.concourse.thrift.TDuplicateEntryException;

/**
 * An exception that is thrown when attempting to conditionally add or insert
 * data based on a condition that should be unique, but is not.
 * 
 * @author Jeff Nelson
 */
public class DuplicateEntryException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Construct a new instance.
     * 
     * @param thrift
     */
    public DuplicateEntryException(TDuplicateEntryException thrift) {
        super(thrift.getMessage());
    }

}