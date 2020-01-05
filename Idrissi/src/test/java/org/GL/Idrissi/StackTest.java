package org.GL.Idrissi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StackTest {

	
	Stack<Object> stack;

    @Test
    @DisplayName("instantiate new Stack()")
    void isInstantiatedWithNew() {
        new Stack<>();
    }
    
    
    
    @Nested
    @DisplayName("when new")
    class NewStack {

        @BeforeEach
        void createNewStack() {
            stack = new Stack<>();
        }

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            assertTrue(stack.isEmpty());
        }
        
        @Test
        @DisplayName("throws EmptyStackException when popped")
        void throwsExceptionWhenPopped() {
            assertThrows(EmptyStackException.class, stack::pop);
        }
        
        
        @Nested
        @DisplayName("after pushing an element")
        class Pushing {

            int random = new Random().nextInt(200);


            @BeforeEach
            void pushRandom() {
                System.out.println("random pushed : "+ random);
                stack.push(random);
            }

            @Test
            @DisplayName("it is no longer empty")
            void isNotEmpty() {
                assertFalse(stack.isEmpty());
            }
            
        }
        
    }
	
}
