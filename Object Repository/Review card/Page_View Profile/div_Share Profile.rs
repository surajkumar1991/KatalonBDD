<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Share Profile</name>
   <tag></tag>
   <elementGuidId>e6291597-cb6b-4063-a10f-b4b0d1294829</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>row</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
            
                
                
                    
                        
                        
  
                                
                                    
                                
                                
                                     Share Profile
                                
                            
                            
                                    
                                
                            
                            Yamanappa Ogennavar
                            yamanappa4
                                                            
                                        Disconnect
                                                                                Follow
                                
                        
                        
                        
                            
                                
                                    Connection(s)
                                    2
                                
                                
                                    Followers
                                    0
                                
                            
                            
                                
                                    Avg Rating
                                    4.0
                                
                                
                                    Following
                                    0
                                
                               
                            
                        
                            
                                
                                    
                                            
                                                
                                                /viratkohlifb
                                            
                                                                                    
                                                
                                                /yamanappa-ogennavar-74015057
                                            
                                    
                                
                          
                    
                
                
            
            
                
                
                    
                    





    
        
            
                Ratings For : 
                ×
            
            
                
                
                
                    
                        
                            Desire to work with again
 *(mandatory parameter)                         
                        
                    
                    
                        
                            Encourages work life balance
                        
                        
                    
                    
                        
                            Dependability
                        
                        
                    
                    
                        
                            Solution Seeker
                        
                        
                    
                    
                        
                            Willingness to Learn
                        
                        
                    
                    
                        
                            Enthusiasm
                        
                        
                    
                    
                        
                            Clarity in Communication
                        
                        
                    
                    
                        
                            Mutual Respect
                        
                        
                    
                
            
            

            
                Back
                Reset
                Submit
            
        
    








    
        
         Ratings
            
                        
    
    
        
            
        
        
    
   
    



    
         Rate Now
    




        
            
                
                    Desire to work with again
                    1 Votes
                
                
                    
                        
                    
                    Rank
                        NA
                

                
                    Rating
                    
                        
                    
                    4/5
                    
                    
                    View details
                
            
            
        
            
                
                    Dependability
                    1 Votes
                
                
                    
                        
                    
                    Rank
                        NA
                

                
                    Rating
                    
                        
                    
                    4/5
                    
                    
                    View details
                
            
            






     var isReviewed = 'False';
     var isUsername='Verified';

    

     $(function()
     {
        if(2 !=null &amp;&amp; 2&lt;=1)
        {
             $(&quot;#reviewFilterIcon&quot;).css(&quot;display&quot;,&quot;none&quot;)}else{$(&quot;#reviewFilterIcon&quot;).css(&quot;display&quot;,&quot;inline-block&quot;)
         }
    });

    $(&quot;#linkAddReview&quot;).click(function () 
    {
         $(&quot;#backToRecommendation&quot;).css(&quot;display&quot;,&quot;none&quot;);
         $(&quot;#backToReview&quot;).css(&quot;display&quot;,&quot;block&quot;);

         if (235 == 0)
         {
             window.location.href = &quot;/Login/Login&quot;;
         }
         else
         {
             GetUserVerificationStatus(function(isVerified)
             {
                 if (isReviewed == 'False' &amp;&amp; isVerified[0] == true &amp;&amp; isVerified[1]==true)
                 {
                     type = &quot;review&quot;;
                     if(relation_id!=0 &amp;&amp; relation_id!=6)
                     {
                         WriteReviewRecommendation();
                     }else if(relation_id==6){ShowSuccessAlert(&quot;You cannot recommend to your friends/family&quot;, &quot;&quot;);}
                     else if(relation_id==0)
                     {
                         RelationshipModal(recommendedTo, &quot;WriteReviewRecommendation&quot;,&quot;Rating&quot;);
                     }
                 }
                else if (isReviewed == 'True') {
                    ShowSuccessAlert(&quot;You have already reviewed&quot;, &quot;Please try after 1 day&quot;);
                }
                     else if(isVerified[0]==false)
                    {
                       GetNotVerifiedModal();
                     }

                 else
                     {
                         //if(isUsername=='True')
                         //{

                         //    callForSNMurl();
                         //    //ShowSuccessAlert(thirdPartyUserName +&quot;'s Open the next tab&quot;, &quot;Check&quot;);
                         //}
                         //else{
                         //    ShowSuccessAlert(thirdPartyUserName +&quot;'s verification is in progress&quot;, &quot;Please try later&quot;);
                         //}
                         callForSNMurl();
                 }
             });
         }
        });


     $(&quot;#btnViewMoreReview&quot;).click(function () {

         if ($(&quot;#btnViewMoreReview&quot;).text() == &quot;View more&quot;) {
             $(&quot;#hiddenReviewCount&quot;).val(0);
             ReviewAjax(&quot;View less&quot;);
         }
         else {
             $(&quot;#hiddenReviewCount&quot;).val(3);
             ReviewAjax(&quot;View more&quot;);
         }
     })
     function ViewMoreReview() {
         if ($(&quot;#btnViewMoreReview&quot;).text() == &quot;View more&quot;) {
             $(&quot;#hiddenReviewCount&quot;).val(3);
             ReviewAjax(&quot;View more&quot;);
         }
         else if($(&quot;#btnViewMoreReview&quot;).text() == &quot;View less&quot;) {
             $(&quot;#hiddenReviewCount&quot;).val(0);
             ReviewAjax(&quot;View less&quot;);
         }
         else
         {
             $(&quot;#hiddenReviewCount&quot;).val(3);
             ReviewAjax(&quot;View more&quot;);
         }
     }

     function ReviewAjax(btnTitle)
     {
         $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
         $.ajax({
             url: '/PartialProfile/_ReviewListForUserProfile/289',
             datatype: 'json',
             traditional: true,
             data: $(&quot;#reviewFilterForm&quot;).serialize(),
             type: 'POST',
             success: function (data) {
                 $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                 $(&quot;#partialReviewList&quot;).html(data);
                 $(&quot;#btnViewMoreReview&quot;).text(btnTitle);
             },
             error: function (error) {
             }
         });
     }

    $(&quot;#rev_video_pop_up&quot;).on(&quot;click&quot;, function (e) {
        if ($('#myfileplayer').length == 0) {
            var mydiv = $(&quot;#player1&quot;);
            var src = 'https://qa.thework.life/' + &quot;Content/Videos/Reviews_For_User_Profile.mp4&quot;;
            var myvideo = $(&quot;&lt;video id='fbVideo'  controls>&lt;/video>&quot;);
            myvideo.attr('src', src);
            mydiv.html(myvideo);
        }
    });







    var reviewCategoryId=0;
    //RATING
    $('.star').star()
    var starLists = [];

    var catCount=8;
    var reviewRating=[4,0,4,0,0,0,0,0];
    
    if(reviewRating!=null)
    {
        GetExistingReview();
    }

    function GetExistingReview()
    {
       
        for(var i=1;i&lt;=catCount;i++)
        {
            for(var j=1;j&lt;=reviewRating[i-1];j++)
            {
                $(&quot;#starCat_&quot;+i).find(&quot;#star&quot;+j).removeClass(&quot;fa-star-o&quot;).addClass(&quot;fa-star&quot;);
            }
        }
    }

    function ReviewModalClose()
    {
        $(&quot;#modalReview&quot;).modal(&quot;hide&quot;);
        ClearReview();
        GetExistingReview();
    }

    function ClearReview()
    {
        $(&quot;#RatingBody .rating-list&quot;).each(function () {
            var $this = $(this);
            var $items = $this.find(&quot;span&quot;);
            var i = 0
            $($items).each(function () {
                if ($(this).hasClass(&quot;fa fa-star&quot;))
                { $(this).removeClass('fa-star').addClass('fa-star-o');
                }
            });
        });
    }
    $(&quot;#backToRecommendation&quot;).click(function () {
        $(&quot;#modalReview&quot;).modal(&quot;hide&quot;);
        $(&quot;#modalRecommendation&quot;).modal(&quot;show&quot;);
        CloseAddRecommendation();
    });
    $(&quot;#btnSubmitReview&quot;).click(function(){

        starLists = [];
        $(&quot;#RatingBody .rating-list&quot;).each(function () {
            var $this = $(this);
            var $items = $this.find(&quot;span&quot;);
            var i = 0
            $($items).each(function () {
                if ($(this).hasClass(&quot;fa fa-star&quot;))
                { i++; }
            });
            starLists.push(i);
        });
        if(starLists[0]==0)
        {return false;}
        else{ AddReview();}

    });
    $(&quot;#btnReset&quot;).click(function(){
        ClearReview();
    });

    function  AddReview()
    {
        if($(&quot;#btnSubmitReview&quot;).text()==&quot;Next&quot;)
        {
            $(&quot;#btnSubmitReview&quot;).val()
            $(&quot;#modalReview&quot;).modal(&quot;hide&quot;);
            $(&quot;#modalRecommendation&quot;).modal(&quot;show&quot;);
        }
        else
        {
            submitReviewRecommemandation(RecommendationMessage,is_anonymous);
        }
    }
 function ReviewDetails(categoryId) {
     reviewCategoryId=categoryId;
     $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
         $.ajax({
             url: '/PartialProfile/_ReviewDetails',
             datatype: 'json',
             traditional: true,
             data:{reviewTo:289, categoryId:categoryId},
             type: 'POST',
             success: function (data) {
                 $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                 $(&quot;#partialReviewDetails&quot;).html(data);
                 $(&quot;#modalReviewDetails&quot;).modal(&quot;show&quot;);
             },
             error: function (error) {
             }
         });
    }



    
        
            
                Social Media Network Links 
                
            
            
                This is an unverified user. Please input Facebook or LinkedIn Profile Link for Yamanappa Ogennavar.
            
            
                
                    
                        
                        Enter Facebook or LinkedIn Profile Link
                        
                            
                                
                                    
                                            
                                    
                                    
                                
                                
                            
                        
                        
                        
                            
                                
                                    
                                        
                                    
                                    
                                
                                
                            
                        

                    
                    
                        
                            
                        
                    
                
            
            
                Cancel
                Submit
            
        
    




    
        
            
                ×
                Watch tutorial
            
            
                
            
            
                Close
            
        
    






    
        
            
                ×
                This user already exists.Would you like to redirect to this profile?
            
            
                No
                Yes
            
        
    



    
        
            
                ×
                This profile has been added to thework.life
            
            
                OK
            
        
    



    $(document).ready(function () {

        $(&quot;.custom-input-group-addon&quot;).css({
            &quot;background-color&quot;:&quot;white&quot;, 
            &quot;border-radius&quot;: &quot;0&quot;,
            &quot;border-color&quot;: &quot;rgb(173, 171, 171)&quot;,
            &quot;border-width&quot;: &quot;1px&quot;,
            &quot;border-right&quot;: &quot;0 solid transparent&quot;,
            &quot;border-left&quot;: &quot;1 solid &quot;,
            &quot;border-top&quot;: &quot;1 solid &quot;,
            &quot;border-bottom&quot;: &quot;1 solid &quot;,
        });
        $(&quot;.form-control.custom-form-control&quot;).css({
            &quot;background-color&quot;: &quot;white&quot;,
            &quot;border-radius&quot;: &quot;0&quot;,
            &quot;border-width&quot;: &quot;1px&quot;,
            &quot;border-color&quot;: &quot;rgb(173, 171, 171)&quot;,
            &quot;border-left&quot;: &quot;0 solid transparent&quot;,
            &quot;border-right&quot;: &quot;1 solid &quot;,
            &quot;border-top&quot;: &quot;1 solid &quot;,
            &quot;border-bottom&quot;: &quot;1 solid &quot;,
        });
        $(&quot;.form-control.custom-form-control&quot;).focus(function () {
            $(this).css({
                &quot;border&quot;: &quot;2px solid #db2e50&quot;,
            })
        });
        $(&quot;.form-control.custom-form-control&quot;).blur(function () {
            $(this).css({
                &quot;background-color&quot;: &quot;white&quot;,
                &quot;border-radius&quot;: &quot;0&quot;,
                &quot;border-width&quot;: &quot;1px&quot;,
                &quot;border-color&quot;: &quot;rgb(173, 171, 171)&quot;,
                &quot;border-left&quot;: &quot;0 solid transparent&quot;,
                &quot;border-right&quot;: &quot;1 solid &quot;,
                &quot;border-top&quot;: &quot;1 solid &quot;,
                &quot;border-bottom&quot;: &quot;1 solid &quot;,
            })
        });
    });

    var thirdpartyname = $('#viewprofileUserName').val();
    $(&quot;#informMsg&quot;).html(&quot;This is an unverified user. Please input Facebook or LinkedIn Profile Link for &quot; + thirdpartyname + &quot;.&quot;);

    $(&quot;#txtfbLink&quot;).keyup(function () {
        if ($(&quot;#txtfbLink&quot;).val() == &quot;&quot;) {

            $(&quot;#txtLiLink&quot;).removeAttr('disabled');

        }
        else {
            $(&quot;#txtLiLink&quot;).prop(&quot;disabled&quot;, &quot;true&quot;);
        }
    });

    $(&quot;#txtLiLink&quot;).keyup(function () {
        if ($(&quot;#txtLiLink&quot;).val() == &quot;&quot;) {
            $(&quot;#txtfbLink&quot;).removeAttr('disabled');

        }
        else {
            $(&quot;#txtfbLink&quot;).prop(&quot;disabled&quot;, &quot;true&quot;);
        }
    });

    function submitURL()
    {
        console.log($('#viewprofileUserName').val())
        var facebookUsername = $(&quot;#txtfbLink&quot;).val()
        var liUsername = $(&quot;#txtLiLink&quot;).val();
        var thirdpartyname = $('#viewprofileUserName').val();
        var smnUrlAddedforuser = '289';

        var chk = checkvalidation();
        //console.log('smnUrlAddedforuser=' + smnUrlAddedforuser);
        if (chk != false) {
            var data1 = {
                name: thirdpartyname,
                fb_username: facebookUsername,
                li_user_link: liUsername,
                smn_url_submitted_by: smnUrlAddedforuser
            };
            $.ajax({
                url: '/Profile/AddProfileToDB',
                datatype: 'json',
                traditional: true,
                data: data1,
                type: 'POST',
                success: function (data) {
                    $(&quot;#modelSMNUrl&quot;).modal(&quot;hide&quot;);
                    if (data.Id == 1) {
                        $(&quot;#PopupworklifeUrlUserAdded&quot;).attr('href', data.Name);
                        $(&quot;#popupUserAdded&quot;).modal(&quot;show&quot;);
                    }
                    else {
                        $(&quot;#PopupworklifeUrl&quot;).attr('href', data.Name);
                        $(&quot;#popupUserExist&quot;).modal(&quot;show&quot;);
                    }
                        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                       // window.location.reload(true);
                       // setTimeout(ShowSuccessAlert(&quot;You have initiated the verification process.&quot;), 5000);
                },
                error: function (error) {
                }
            });
        }
    }

    function SMNModalClose() {
        $(&quot;#modelSMNUrl&quot;).modal(&quot;hide&quot;);
        $('#txtfbLink').val('');
        $('#txtLiLink').val('');
    }

    function checkvalidation() {
        if ($(&quot;#txtLiLink&quot;).val() == &quot;&quot; &amp;&amp; $(&quot;#txtfbLink&quot;).val() == &quot;&quot;) {
            $(&quot;#errorLnUserName&quot;).html(&quot;Please add LinkedIn or Facebook url.&quot;);
            return false;
        }
        else {
            $(&quot;#errorLnUserName&quot;).html(&quot;&quot;);
        }
    };




    
        
            
                
                    write a recommendation for 
                    ×
                
                
                
                    
                        
                    
                    
                    fbguisfgsgvkdglbsvjkgdkgsjbvsjkvsjkbvslbvslbvlsbsbvsbvbvsvbvxbvnmvbnmbvmxb
                    
                    
                    Min 50 characters
                    
                    
                    
                        
                            
                            
                            Post anonymously
                        
                        
                    
                
                
                    Back
                    Submit
                
            
        
    

    var recommendationPrevMsg = 'fbguisfgsgvkdglbsvjkgdkgsjbvsjkvsjkbvslbvslbvlsbsbvsbvbvsvbvxbvnmvbnmbvmxb';
    var recommendationIsAnonymous = 'True';
    var message = 'fbguisfgsgvkdglbsvjkgdkgsjbvsjkvsjkbvslbvslbvlsbsbvsbvbvsvbvxbvnmvbnmbvmxb';
    if ('True' === 'False')
    {
        $(&quot;#removedivifanony&quot;).remove();
    }

        if ('True' == &quot;True&quot;) {
            $(&quot;#isAnonymous&quot;).attr(&quot;checked&quot;, &quot;checked&quot;);
        }
        else if(message!=&quot;&quot;)
            $(&quot;#lblisAnonymous&quot;).css(&quot;display&quot;, &quot;none&quot;);

        $(function () {
            $(&quot;#backToReview&quot;).css(&quot;display&quot;, &quot;none&quot;);
        });
        $(&quot;#backToReview&quot;).click(function () {
            $(&quot;#modalRecommendation&quot;).modal(&quot;hide&quot;);
            $(&quot;#modalReview&quot;).modal(&quot;show&quot;);
            CloseAddRecommendation();
        });

    








    
        
            
                
            recommendations
        
            
                    
    
    
        
        
            
            
        
    
    



        
             Recommend
        



        
            

                    
            
            
                
                        Anonymous
                        
                    


                                    Worked together at  fgwuifgk
                                            
                

                    
                        fbguisfgsgvkdglbsvjkgdkgsjbvsjkvsjkbvslbvslbvlsbsb...
                    
                        Read more...
                
                
                


                    
                        

                            
                                 0
                                 0
                                                            
                            
                                
                                    
                                    Share
                                
                            
                            

                        
                    
                            
                            
            

        







    
        
            
                share recommendation
                ×
            
            
                Recommendation to share:
                
                      has reviewed 
                    
                
                Share via
                
                
                
                
            
        
    





    var isRecommended = 'False';
    var message = &quot;&quot;;
    var whatsappmsg=&quot;&quot;;
    var workLifeUrl = &quot;&quot;;

    


    $(function(){
        if(1 !=null &amp;&amp; 1&lt;=1)
        {$(&quot;#recFilterIcon&quot;).css(&quot;display&quot;,&quot;none&quot;)}else{$(&quot;#recFilterIcon&quot;).css(&quot;display&quot;,&quot;inline-block&quot;)}
    });
    function ReadMore(id) {
        if ($(&quot;#ReadMore_&quot; + id).text() == &quot;Read more...&quot;) {
            $(&quot;#recMessage_&quot; + id).text($(&quot;#FullRecMessage_&quot; + id).val());
            $(&quot;#ReadMore_&quot; + id).text(&quot;Read less...&quot;);
        }
        else {
            $(&quot;#recMessage_&quot; + id).text($(&quot;#ShortMessage_&quot; + id).val());
            $(&quot;#ReadMore_&quot; + id).text(&quot;Read more...&quot;);
        }
    }


    $(&quot;#linkWriteRecommendation&quot;).click(function () {
        if (235 == 0) 
        { 
            window.location.href = &quot;/Login/Login&quot;; 
        }
        else
        {
            GetUserVerificationStatus(function(isVerified)
            {
                if (isRecommended == 'False' &amp;&amp; isVerified[0] == true &amp;&amp; isVerified[1] == true) 
                {
                    type = &quot;review&quot;;//recommendation
                    if (relation_id != 0 &amp;&amp; relation_id != 6) 
                    {
                        WriteReviewRecommendation();
                    } 
                    else if(relation_id==6)
                    {
                        ShowSuccessAlert(&quot;You cannot recommend to your friends/family&quot;, &quot;&quot;);
                    }
                    else if (relation_id == 0) 
                    {
                        RelationshipModal(recommendedTo, &quot;WriteReviewRecommendation&quot;, &quot;Rating&quot;);//Recommendation
                    }
                } 
                else if (isRecommended == 'True') 
                {
                    ShowSuccessAlert(&quot;You have already reviewed&quot;, &quot;Please try after 1 day&quot;);
                }
                else if(isVerified[0] == false) 
                {
                    GetNotVerifiedModal();
                }
                else
                {
                    //if(isUsername=='True')
                    //{
                    //    callForSNMurl();
                    //}
                    //else
                    //{
                    //    ShowSuccessAlert(thirdPartyUserName +&quot;'s verification is in progress&quot;, &quot;Please try later&quot;);
                    //}
                    callForSNMurl();
                }
            });
        }
    });

    $(&quot;#btnViewMoreRec&quot;).click(function () {

        if ($(&quot;#btnViewMoreRec&quot;).text() == &quot;View more&quot;) {
            $(&quot;#hiddenRecommendationCount&quot;).val(0);
            RecommendationAjax(&quot;View less&quot;);
        }
        else {
            $(&quot;#hiddenRecommendationCount&quot;).val(2);
            RecommendationAjax(&quot;View more&quot;);
        }
    })
    function ViewMoreRec() {
        if ($(&quot;#btnViewMoreRec&quot;).text() == &quot;View more&quot;) {
            $(&quot;#hiddenRecommendationCount&quot;).val(2);
            RecommendationAjax(&quot;View more&quot;);
        }
        else if($(&quot;#btnViewMoreRec&quot;).text() == &quot;View less&quot;){
            $(&quot;#hiddenRecommendationCount&quot;).val(0);
            RecommendationAjax(&quot;View less&quot;);
        }else
        {
            $(&quot;#hiddenRecommendationCount&quot;).val(2);
            RecommendationAjax(&quot;View more&quot;);
        }
    }
    function RecommendationAjax(btnTitle)
    {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        $.ajax({
            url: '/PartialProfile/_RecommendationListForUserProfile/289',
            datatype: 'json',
            traditional: true,
            data: $(&quot;#reviewFilterForm&quot;).serialize(),
            type: 'POST',
            success: function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialRecommendationList&quot;).html(data);
                $(&quot;#btnViewMoreRec&quot;).text(btnTitle);
            },
            error: function (error) {
            }
        });
    }
    function SocialSharing(id,isAno) {
        if (235 == 0) { window.location.href = &quot;/Login/Login&quot;; }
        else
        {
            whatsappmsg=&quot;&quot;; var n=&quot;&quot;;
            if ('' == &quot;Given&quot;) {
                if (isAno)
                {
                    $('#shareUserName').text(&quot;Someone&quot;);
                    n=&quot;Someone&quot;;
                    whatsappmsg +=&quot;See the review given by *Someone* &quot;+($(&quot;#designation_&quot; + id).text().trim())+ &quot; to &quot;;
                }
                else
                {
                    $('#shareUserName').text($('#recm_to_' + id).val());
                    n=($('#recm_to_' + id).val());
                    whatsappmsg +=&quot;See the review given by *&quot;+n+&quot;* &quot;+($(&quot;#designation_&quot; + id).text().trim()) +&quot; to &quot;;
                }

                $(&quot;#recm_to&quot;).html($(&quot;#userName_&quot; + id).text());
                whatsappmsg+=&quot;*&quot;+($(&quot;#userName_&quot; + id).text()) +&quot;* on &quot; +window.location.href;
            }
            else {
                if (isAno)
                {
                    $('#shareUserName').text(&quot;Someone&quot;);
                    n=&quot;Someone&quot;;
                    whatsappmsg +=&quot;See the review given by *Someone* &quot;+($(&quot;#designation_&quot; + id).text().trim())+ &quot; to &quot;;
                }
                else
                {
                    $(&quot;#shareUserName&quot;).html($(&quot;#userName_&quot; + id).text());
                    n= ($(&quot;#userName_&quot; + id).text());
                    whatsappmsg +=&quot;See the review given by *&quot;+n+&quot;* &quot;+($(&quot;#designation_&quot; + id).text().trim()) +&quot; to &quot;;
                }

                $('#recm_to').text($('#recm_to_' + id).val());
                // $(&quot;#shareUserName&quot;).html($(&quot;#userName_&quot; + id).text());
                whatsappmsg+=&quot;*&quot;+ ($('#recm_to_' + id).val().trim()) +&quot;* on &quot;+window.location.href;
            }

            //$(&quot;#shareUserName&quot;).html($(&quot;#userName_&quot; + id).text());
            $(&quot;#shareDesignation&quot;).html($(&quot;#designation_&quot; + id).text());
            $(&quot;#shareMessage&quot;).text($(&quot;#FullRecMessage_&quot; + id).val());
            message = $(&quot;#ShareRecommandation&quot;).text().trim();
            workLifeUrl = $(&quot;#viewprofileWorklifeUrl&quot;).val();
            whatsappmsg+=&quot;\n \n  _&quot; + n +&quot; Wrote_: &quot;+  ($(&quot;#FullRecMessage_&quot; + id).val().trim());
            $(&quot;#ModalShare&quot;).modal(&quot;show&quot;);
        }

    };
    function ReadMore(id) {
        if ($(&quot;#ReadMore_&quot; + id).text() == &quot;Read more...&quot;) {
            $(&quot;#recMessage_&quot; + id).text($(&quot;#FullRecMessage_&quot; + id).val());
            $(&quot;#ReadMore_&quot; + id).text(&quot;Read less...&quot;);
        }
        else {
            $(&quot;#recMessage_&quot; + id).text($(&quot;#ShortMessage_&quot; + id).val());
            $(&quot;#ReadMore_&quot; + id).text(&quot;Read more...&quot;);
        }
    };

    function ReportRecommandation(id) {
        if (235 == 0) { window.location.href = &quot;/Login/Login&quot;; }
        else
        {

            GetUserVerificationStatus(function(isVerified){
                if (isVerified[0] == false) {
                    GetNotVerifiedModal();
                    return false;
                }
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
                $.ajax({
                    url: '/PartialProfile/_RecommendationReport',
                    type: 'GET',
                    data:{flag:false},
                    success: function (result) {
                        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                        $(&quot;#partialRecommandationReport&quot;).html(result);
                        $(&quot;#ReportRecId&quot;).val(id);
                        $(&quot;#ModalReport&quot;).modal(&quot;show&quot;);
                    },
                    error: function (err) {
                    }
                });
            });
        }
    };



    $(&quot;#twitterShareButton&quot;).click(function () {
        $(&quot;#ModalShare&quot;).modal(&quot;hide&quot;);
        window.open(&quot;https://twitter.com/share?text=&quot; + message + &quot;&amp;url=&quot;+workLifeUrl+&quot;&quot;,&quot;_blank&quot;);
    });

    $(&quot;#liShareButton&quot;).click(function () {
        $(&quot;#ModalShare&quot;).modal(&quot;hide&quot;);
        window.open(&quot;https://www.linkedin.com/shareArticle?mini=true&amp;url=&quot; + workLifeUrl + &quot;&amp;submitted-image-url=&quot;+profileUrl+&quot;&amp;title=&quot; + message + &quot;&amp;source=&quot; + workLifeUrl + &quot;&quot;, &quot;_blank&quot;);

    });

    $(&quot;#btnwhatsapp_rev&quot;).click(function(){
        $(&quot;#ModalShare&quot;).modal(&quot;hide&quot;);
        console.log(whatsappmsg);
        window.open(&quot;https://api.whatsapp.com/send?text=&quot;+encodeURIComponent(whatsappmsg));
    });

    $(&quot;#fbShareButton&quot;).click(function () {
        $(&quot;#ModalShare&quot;).modal(&quot;hide&quot;);
        FB.ui({
            method: 'share_open_graph',
            action_type: 'og.shares',
            display: 'popup',
            action_properties: JSON.stringify({
                object: {
                    'og:url': workLifeUrl,
                    'og:title': message,
                    //'og:description': &quot;jhgdfhsdhfgsdjhfbkdsjfkhdsfkjdsvfkhvdskhfvdskfvsdhkf&quot;,
                    'og:image': profileUrl
                }
            })
        },
         function (response) {
             window.open(&quot;https://www.facebook.com/&quot;,&quot;_blank&quot;);
         });
    });

    function CommentOn(RecId)
    {
        $.ajax({
            url: '/PartialProfile/_RecommendationComment',
            type: 'GET',
            data: { recommendationId: RecId },
            success: function (result) {
                $(&quot;#RecommendationCommentList_&quot; + RecId).html(result);
                $(&quot;#btnShowReplies_&quot; + RecId).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#div_&quot; + RecId).css(&quot;display&quot;, &quot;block&quot;);
                $(&quot;#txtRecComment_&quot; + RecId).focus();
            },
            error: function (err) {
            }
        });
    }

    function ShowReplies(RecId)
    {
        $.ajax({
            url: '/PartialProfile/_RecommendationComment',
            type: 'GET',
            data:{recommendationId:RecId},
            success: function (result) {
                $(&quot;#RecommendationCommentList_&quot;+RecId).html(result);
                $(&quot;#btnShowReplies_&quot;+RecId).css(&quot;display&quot;, &quot;none&quot;);
            },
            error: function (err) {
            }
        });
    }

    $(&quot;#rec_video_pop_up&quot;).on(&quot;click&quot;, function (e) {
        if ($('#myfileplayer').length == 0) {
            var mydiv = $(&quot;#player1&quot;);
            var src = 'https://qa.thework.life/' + &quot;Content/Videos/Reviews_For_User_Profile.mp4&quot;;
            var myvideo = $(&quot;&lt;video id='fbVideo'  controls>&lt;/video>&quot;);
            myvideo.attr('src', src);
            mydiv.html(myvideo);
        }
    });





    var recommendationId = 0;

    $(function ($) {
        $(&quot;#recommended_to&quot;).val(289);
        $(&quot;#lblRecommendationCompany&quot;).text(&quot;&quot;);
    });

    function AgreeDisAgreeClick(reviewId,flag) {
        if (235 == 0) { window.location.href = &quot;/Login/Login&quot;; }
        else
        {
            if(flag==true)
                isAgree = flag;
            if(flag==false)
                isAgree = flag;
            recommendationId = reviewId;
            GetUserVerificationStatus(function(isVerified){
                if (isVerified[0] ==true) {
                    if(relation_id == 0 ) {
                        type = &quot;like&quot;;
                        RelationshiModalAgree(recommendedTo,reviewId,isAgree, &quot;AgreeDisAgreeClick&quot;, &quot;Agree&quot;);

                    }
                    else
                    {
                        RecommendationLike();
                    }
                }
                else {
                    GetNotVerifiedModal();
                }
            });
        }
    }
    function CloseAddRecommendation()
    {
        $(&quot;#modalRecommendation&quot;).modal(&quot;hide&quot;);
        $(&quot;#labelRecCount&quot;).text(&quot;&quot;);
        $(&quot;#txtRecMessage&quot;).val(recommendationPrevMsg);
        $(&quot;#errorAnnonymous&quot;).text(&quot;&quot;);
        if (recommendationIsAnonymous == &quot;True&quot;) {
            $(&quot;#isAnonymous&quot;).attr(&quot;checked&quot;, &quot;checked&quot;);
        }else{$(&quot;#isAnonymous&quot;).removeAttr(&quot;checked&quot;);}

    }


    $(&quot;#formAdd&quot;).submit(function () {
        if ($(&quot;#txtRecMessage&quot;).val().trim().length &lt; 50) {
            $(&quot;#lblRecMessage&quot;).removeClass(&quot;f-gray&quot;).addClass(&quot;f-red&quot;);
        }
        else {
            if ($(&quot;#btnSubmitRecommendation&quot;).val() == &quot;Next&quot;) {
                RecommendationMessage=$(&quot;#txtRecMessage&quot;).val();

                if($(&quot;#isAnonymous&quot;).prop('checked') == true)
                {
                    is_anonymous=&quot;true&quot;;
                }
                else
                {
                    is_anonymous=&quot;false&quot;;
                }

                $(&quot;#modalRecommendation&quot;).modal(&quot;hide&quot;);
                $(&quot;#modalReview&quot;).modal(&quot;show&quot;);


            }
            else if ($(&quot;#btnSubmitRecommendation&quot;).val() == &quot;Submit&quot;) {
                $(&quot;#btnSubmitRecommemandation&quot;).attr(&quot;disabled&quot;, &quot;disabled&quot;);


                // data=$(this).serialize();
                if($(&quot;#isAnonymous&quot;).prop('checked') == true)
                {
                    is_anonymous=&quot;true&quot;;
                }
                else
                {
                    is_anonymous=&quot;false&quot;;
                }
                submitReviewRecommemandation($(&quot;#txtRecMessage&quot;).val(),is_anonymous,289)
            }
        }
        return false;
    });



    var previousText=&quot;&quot;;
    var currentText=&quot;&quot;;
    var messageTxt=&quot;&quot;
    //$(&quot;#txtRecMessage&quot;).on('keyup', function (e) {
    //    debugger;
    //    if ((e.keyCode === 32 || e.keyCode === 13) &amp;&amp; messageTxt!=&quot;&quot;) {
    //        currentText=$(&quot;#txtRecMessage&quot;).val().trim().replace(messageTxt.trim(),&quot;&quot;);
    //        messageTxt=$(&quot;#txtRecMessage&quot;).val();
    //        if(previousText.trim().toLowerCase()==currentText.trim().toLowerCase())
    //        {
    //            $(&quot;#txtRecMessage&quot;).val(previousText.trim());
    //        }
    //        if(currentText.trim()!=&quot;&quot;)
    //        previousText=currentText.trim();
    //    }

    //});
    $(&quot;#txtRecMessage&quot;).on(&quot;paste&quot;, function(e){
        var pastedData = e.originalEvent.clipboardData.getData('text');
        if($(&quot;#txtRecMessage&quot;).val().length>0 &amp;&amp; previousText.trim().toLowerCase()==pastedData.trim().toLowerCase())
        { previousText=pastedData;return false;}
        if(pastedData.trim()!=&quot;&quot;)
        previousText=pastedData;
    });

    $(&quot;#isAnonymous&quot;).change(function () {
        if (this.checked) {
            $.ajax({
                url: '/Profile/AnonymousRecommandation',
                type: 'GET',
                success: function (result) {
                    if (result == &quot;true&quot;)
                    {
                        $(&quot;#errorAnnonymous&quot;).text(&quot;&quot;);
                    }
                    else  {
                        $(&quot;#errorAnnonymous&quot;).text(result); $(&quot;#isAnonymous&quot;).removeAttr('checked');
                    }

                },
                error: function (err) {
                }
            });
        }
    });







    $(&quot;#btnViewMoreExp&quot;).click(function () {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        if ($(&quot;#btnViewMoreExp&quot;).text() == &quot;View more&quot;) {
            $.get('/PartialProfile/_ExperienceListForUserProfile/289?count=0', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialExperienceList&quot;).html(data);
                $(&quot;#btnViewMoreExp&quot;).text(&quot;View less&quot;);
            });
        }
        else {
            $.get('/PartialProfile/_ExperienceListForUserProfile/289?count=2', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialExperienceList&quot;).html(data);
                $(&quot;#btnViewMoreExp&quot;).text(&quot;View more&quot;);
            });
        }
    })
    $(function () {
        experienceCount = '0';
    });

                        



    $(&quot;#btnViewMoreEducation&quot;).click(function () {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        if ($(&quot;#btnViewMoreEducation&quot;).text() == &quot;View more&quot;) {
            $.get('/PartialProfile/_EducationListForUserProfile/289?count=0', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialEducationList&quot;).html(data);
                $(&quot;#btnViewMoreEducation&quot;).text(&quot;View less&quot;);
            });
        }
        else {
            $.get('/PartialProfile/_EducationListForUserProfile/289?count=2', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialEducationList&quot;).html(data);
                $(&quot;#btnViewMoreEducation&quot;).text(&quot;View more&quot;);
            });
        }
    })
    $(function () {
        educationCount = '0';
    });




    


    $(&quot;#btnViewMoreCourse&quot;).click(function () {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        if ($(&quot;#btnViewMoreCourse&quot;).text() == &quot;View more&quot;) {
            $.get('/PartialProfile/_CourseListForUserProfile/289?count=0', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialCourseList&quot;).html(data);
                $(&quot;#btnViewMoreCourse&quot;).text(&quot;View less&quot;);
                alert(data.response.length);
                if (data.count &lt;= 2) { $(&quot;#btnViewMoreCourse&quot;).hide() }

            });
        }
        else {
            $.get('/PartialProfile/_CourseListForUserProfile/289?count=2', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialCourseList&quot;).html(data);
                $(&quot;#btnViewMoreCourse&quot;).text(&quot;View more&quot;);
            });
        }
    })
    $(function () {
        courseCount = '0';
    });






    $(&quot;#btnViewMoreAwards&quot;).click(function () {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        if ($(&quot;#btnViewMoreAwards&quot;).text() == &quot;View more&quot;) {
            $.get('/PartialProfile/_HonorsRewardsListForUserProfile/289?count=0', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialAwardsList&quot;).html(data);
                $(&quot;#btnViewMoreAwards&quot;).text(&quot;View less&quot;);
                alert(data.response.length);
                if (data.count &lt;= 2) { $(&quot;#btnViewMoreCourse&quot;).hide() }

            });
        }
        else {
            $.get('/PartialProfile/_HonorsRewardsListForUserProfile/289?count=2', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialAwardsList&quot;).html(data);
                $(&quot;#btnViewMoreAwards&quot;).text(&quot;View more&quot;);
            });
        }
    })
    $(function () {
        honorsCount = '0';
    });
    

       



    $(&quot;#btnViewMoreLanguage&quot;).click(function () {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        if ($(&quot;#btnViewMoreLanguage&quot;).text() == &quot;View more&quot;) {
            $.get('/PartialProfile/_LanguageListForUserProfile/289?count=0', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialLangauageList&quot;).html(data);
                $(&quot;#btnViewMoreLanguage&quot;).text(&quot;View less&quot;);
            });
        }
        else {
            $.get('/PartialProfile/_LanguageListForUserProfile/289?count=3', function (data) {
                $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                $(&quot;#partialLangauageList&quot;).html(data);
                $(&quot;#btnViewMoreLanguage&quot;).text(&quot;View more&quot;);
            });
        }
    })
    $(function () {
        lanuageCount = '0';
    });



                        



  


    
    $(&quot;#linkEndorsement&quot;).click(function () {
        if (235 == 0) { window.location.href = &quot;/Profile/ViewProfileEx?username=https://qa.thework.life/yamanappa4/&quot;; }
        else
        {
            GetUserVerificationStatus(function (isVerified) {
                if (isVerified[0] == true) {
                    type = &quot;endorsement&quot;;
                    if (relation_id != 0 &amp;&amp; relation_id != 6) {
                        GetEndorsementList();
                    }
                    else if (relation_id == 0) {
                        RelationshipModal(recommendedTo, &quot;GetEndorsementList&quot;, &quot;Endorsement&quot;);
                    }
                }  else {
                    GetNotVerifiedModal();
                }
            });
        }
    });
    function GetEndorsementList()
    {
        $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
        $.get('/PartialProfile/_Endorsement/289', function (data) {
            $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
            $(&quot;#modalEndorseSkills&quot;).html(data);
            $(&quot;#modalEndorseSkills&quot;).modal(&quot;show&quot;);
        });
    }
  


                        
                    
                    
                
                
            
            
                
                
                        
                            

  people you may know See all 
    
                
                    
                        
 
                        
                    
                    
                        TWL Moderator
                        
                        
                            
                                Connect
                                Ignore
                            
                        
                    
                
                
                    
                        
 
                        
                    
                    
                        TWL Moderator2
                        
                        
                            
                                Connect
                                Ignore
                            
                        
                    
                
                
                    
                        
                                

                        
                    
                    
                        Kunal Kashyap
                        
                        
                            
                                Connect
                                Ignore
                            
                        
                    
                
                
                    
                        
                                

                        
                    
                    
                        Tina Abraham
                        
                        
                            
                                Connect
                                Ignore
                            
                        
                    
                
                
                    
                        
                                

                        
                    
                    
                        Rohini Sharma
                            The office diary Inc
                        
                        
                            
                                Connect
                                Ignore
                            
                        
                    
                
    


    function SuggetionRequestClick(id, flag) {
        if (id == 0 &amp;&amp; requestId != 0) { id = requestId; flag = &quot;connect&quot;; }
        if (flag == &quot;connect&quot; &amp;&amp; requestId == 0) {
            RelationshipModal(id, &quot;SuggetionRequestClick&quot;,&quot;connect&quot;);
        }
        else {
            requestId = 0;
            $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;block&quot;);
            $.ajax({
                url: '/Profile/ConnectionRequestStatus',
                datatype: 'json',
                data: { friendId: id, requestFlag: flag},
                traditional: true,
                type: 'POST',
                success: function (data) {
                    $(&quot;.loader&quot;).css(&quot;display&quot;, &quot;none&quot;);
                    location.reload();
                    $.get('/PartialProfile/_SuggetionList', function (response) {
                        $(&quot;#partialConnectionList&quot;).html(response);
                    });
                },
                error: function (error) {
                }
            });
        }
    }


                            
                        
                    




    
        
            
            
                
                
                
            

            
            
                
                    
                    
                        BUILD VISIBILITY
                        Get your colleagues to review you.
                        
                        
                            
                        

                    
                

                
                    
                    
                        GIVE FEEDBACK
                        Review your colleagues.
                        
                        
                            
                        
                    
                

                
                    
                    
                        CREATE PROFILES
                        Add profiles of colleagues on this site to review them.
                        
                        
                            
                        
                    
                
            
        
    




    
        
            
                ×
                Watch tutorial
            
            
                
            
            
                Close
            
        
    


    
        
            
                ×
                Watch tutorial
            
            
                
            
            
                Close
            
        
    





    $(&quot;#slider1&quot;).on(&quot;click&quot;, function (e) {
        if ($('#myfileplayer').length == 0) {
            var mydiv = $(&quot;#player1&quot;);
            var src = 'https://qa.thework.life/' + &quot;Content/Videos/Reviews_For_User_Profile.mp4&quot;;
            var myvideo = $(&quot;&lt;video id='fbVideo'  controls>&lt;/video>&quot;);
            myvideo.attr('src', src);
            mydiv.html(myvideo);
        }
    });

    $(&quot;#slider2&quot;).on(&quot;click&quot;, function (e) {
        if ($('#myfileplayer').length == 0) {
            var mydiv = $(&quot;#player1&quot;);
            var src = 'https://qa.thework.life/' + &quot;Content/Videos/Reviews_For_User_Profile.mp4&quot;;
            var myvideo = $(&quot;&lt;video id='fbVideo'  controls>&lt;/video>&quot;);
            myvideo.attr('src', src);
            mydiv.html(myvideo);
        }
    });

    $(&quot;#slider3&quot;).on(&quot;click&quot;, function (e) {
        if ($('#myfileplayer').length == 0) {
            var mydiv = $(&quot;#player2&quot;);
            var src = 'https://qa.thework.life/' + &quot;Content/Videos/TWL_ThirdParty_mp4.mp4&quot;;
            var myvideo = $(&quot;&lt;video id='fbVideo'  controls>&lt;/video>&quot;);
            myvideo.attr('src', src);
            mydiv.html(myvideo);
        }
    });
    
 
   


                    
                
                
            
        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content&quot;)/div[@class=&quot;container-fluid m-t-20 user-profile&quot;]/div[@class=&quot;row&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='content']/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Edit Profile'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='My Profile'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
