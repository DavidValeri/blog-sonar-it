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
package valeri.blog.examples.sonar.it;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Test;

/**
 * A quick test to make sure the app is really deployed.
 *
 * @author David Valeri
 */
public class SmokeIT {

    @Test
    public void test() throws Exception {
        
        URL url = new URL("http://localhost:7070/sonar-it-example-app/");
        
        
        BufferedReader in = new BufferedReader(new InputStreamReader(url
                .openConnection().getInputStream()));
        
        String line = in.readLine();
        
        while (line != null) {
            
            if (line.contains("Welcome to the demo!")) {
                return;
            }
            line = in.readLine();
        }
        
        fail();
    }
}
