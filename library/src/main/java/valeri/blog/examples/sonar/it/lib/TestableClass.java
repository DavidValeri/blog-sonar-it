/*
 * Copyright 2013 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package valeri.blog.examples.sonar.it.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example class.
 */
public class TestableClass {
    
    private static final Logger LOG = LoggerFactory.getLogger(TestableClass.class);
    
    public void doSomething(boolean doMoreOfSomething) {
        
        LOG.info("Doing something.");
        
        if (doMoreOfSomething) {
            LOG.info("Doing more of something.");
        }
        
        LOG.info("Did something.");
    }
}
