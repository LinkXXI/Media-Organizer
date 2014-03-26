/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.kevinzoelee.mediaorganizer.contexts;

/**
 *
 * @author Kevin
 */
public class RootContext {
    private static RootContext context = new RootContext();
    
    public static RootContext getContext(){
        return context;
    }
}
